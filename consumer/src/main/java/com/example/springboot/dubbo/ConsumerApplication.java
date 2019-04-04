package com.example.springboot.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.example.springboot.dubbo.quickstart.QuickstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        /*QuickstartConsumer quickstartConsumer = (QuickstartConsumer) run.getBean("quickstartConsumer");
        quickstartConsumer.sendMessage("找年薪百万的工作");*/
    }

}
