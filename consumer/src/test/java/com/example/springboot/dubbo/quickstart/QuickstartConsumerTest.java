package com.example.springboot.dubbo.quickstart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: springboot_dubbo
 * @description: ${description}
 * @author: WangZiYu
 * @create: 2019-04-03 23:51
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickstartConsumerTest {

    @Autowired
    private QuickstartConsumer quickstartConsumer;

    @Test
    public void sendMessage() {
        String message = "百万年薪的工作";
        quickstartConsumer.sendMessage(message);
    }
}