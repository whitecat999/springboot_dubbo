package com.example.springboot.dubbo.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * @program: springboot_dubbo
 * @description: ${description}
 * @author: WangZiYu
 * @create: 2019-04-03 23:38
 **/
@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickstartServiceImpl implements ServiceAPI {

    @Override
    public String sendMessage(String message) {
        System.out.println("调用了provider: sendMessage, time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(System.currentTimeMillis()));
        return "quickstart-provider-message=" + message;
    }
}
