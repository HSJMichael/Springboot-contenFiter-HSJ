package main.quartz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import main.common.Constants;
import main.content.AuthService;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HeJun
 * @version 1.0
 * @description
 * @Date $time$ $date$
 */
@Component
public class TaskQuartz {

    @Scheduled(fixedDelayString = "2588400000")//token 有效期为30天，所以，下次获取token时间为29天23小时后
    public void presentToMemberCoupon(){
      String token=  AuthService.getAuth();
        Constants.token=token;
        System.out.println(Constants.token);
    }

}
