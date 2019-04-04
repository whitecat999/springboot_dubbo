package com.example.springboot.dubbo.quickstart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @program: springboot_dubbo
 * @description: ${description}
 * @author: WangZiYu
 * @create: 2019-04-04 19:25
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickstartServiceImplTest {

    @Autowired
    private QuickstartServiceImpl quickstartService;

    @Test
    public void sendMessage() {
        quickstartService.sendMessage("sssss");
    }
}