package main.content;

import com.baidu.aip.client.BaseClient;
import com.baidu.aip.contentcensor.AipContentCensor;
import main.common.Constants;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author HeJun
 * @version 1.0
 * @description
 * @Date $time$ $date$
 */
public class ConnecrClient {


    private static AipContentCensor baseClient = null;

    /**
     * @Author HeJun
     * @Description  获取连接
     * @Date 21:44 2020/3/14
     * @Param
     * @throws Exception
     * @return
     **/
    public static AipContentCensor getContent() {
        if (baseClient == null) {
            baseClient = new AipContentCensor(Constants.APPID, Constants.APIKEY, Constants.SECRET_KEY);
        }
        return baseClient;
    }

}
