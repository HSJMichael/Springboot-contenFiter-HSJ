package main.content;

import com.baidu.aip.contentcensor.AipContentCensor;
import com.baidu.aip.contentcensor.EImgType;
import com.google.gson.Gson;
import main.dto.ImgResponDto;
import main.dto.MassageDto;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author HeJun
 * @version 1.0
 * @description
 * @Date $time$ $date$
 */
@RestController
public class ContentFiterController {

    @PostMapping("/getToken")
    public String sendDirectMessage() {
        return AuthService.getAuth();
    }

    @Autowired
    /**图片内容审核客户端*/
    private static AipContentCensor contentCensorClient;


    /**
     * @return
     * @throws Exception
     * @Author HeJun
     * @Description 检测文本内容
     * @Date 15:16 2020/3/14
     * @Param
     **/
    @PostMapping("/chackText")
    public String chackText(@RequestBody MassageDto dto) {

        JSONObject response = ConnecrClient.getContent().textCensorUserDefined(dto.getContent());
        Gson gson = new Gson();
        ImgResponDto imgResponDto =new ImgResponDto();
        imgResponDto = gson.fromJson(response.toString(), ImgResponDto.class);

        return response.toString();
    }


    /**
     * @return
     * @throws Exception
     * @Author HeJun
     * @Description 检测图像内容
     * @Date 21:33 2020/3/14
     * @Param
     **/
    @PostMapping("/testImage")
    public String testImage(@RequestBody MassageDto dto) {

        AipContentCensor client = ConnecrClient.getContent();
        JSONObject response = new JSONObject();
        Gson gson = new Gson();
        ImgResponDto imgResponDto =new ImgResponDto();
        if (dto.getType() == 1) {
            String path = dto.getPathOrUrl();
            //    String path = "D:\\HSJ\\桌面文件\\111.jpg";
            response = client.imageCensorUserDefined(path, EImgType.FILE, null);
            System.out.println(response.toString());
            imgResponDto = gson.fromJson(response.toString(), ImgResponDto.class);
            return response.toString();
        }

        // 参数为url
//        String url = dto.getPathOrUrl();
                String url = "http://piedaochuan.oss-cn-shenzhen.aliyuncs.com/erp/u%3D2454486949%2C718417276%26fm%3D26%26gp%3D0_1571644278000.jpg";
        response = client.imageCensorUserDefined(url, EImgType.URL, null);
        imgResponDto = gson.fromJson(response.toString(), ImgResponDto.class);
        System.out.println(response.toString());
        return response.toString();

        // 参数为本地图片文件二进制数组
        //        byte[] file = readImageFile(imagePath);
        //        response = client.imageCensorUserDefined(file, null);
        //        System.out.println(response.toString());

    }


}
