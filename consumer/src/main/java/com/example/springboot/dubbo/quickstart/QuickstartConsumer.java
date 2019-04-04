package com.example.springboot.dubbo.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @program: springboot_dubbo
 * @description: ${description}
 * @author: WangZiYu
 * @create: 2019-04-03 23:46
 **/
@Component
public class QuickstartConsumer {

    @Reference()
    ServiceAPI serviceAPI;

    public void sendMessage(String message) {
        System.out.println(serviceAPI.sendMessage(message));
    }

}
