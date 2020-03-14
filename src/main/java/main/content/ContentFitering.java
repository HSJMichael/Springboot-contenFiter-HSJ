package main.content;

import com.baidu.aip.contentcensor.AipContentCensor;
import org.json.JSONObject;

/**
 * @author HeJun
 * @version 1.0
 * @description
 * @Date $time$ $date$
 */
public class ContentFitering {

    public void sample(AipContentCensor client) {
        // 参数为本地图片路径
        String text = "测试文本";
        JSONObject response = client.textCensorUserDefined(text);

        System.out.println(response.toString());
    }

    public static void main(String[] args) {
        new ContentFitering().sample(new AipContentCensor("", "", ""));
        AipContentCensor client =new AipContentCensor("", "", "");


    }
}
