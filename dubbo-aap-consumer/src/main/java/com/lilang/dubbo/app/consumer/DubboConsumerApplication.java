package com.lilang.dubbo.app.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: lilang
 * Date: 2017/12/28 ProjectName: dubbo-app Version：5.0.0
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:/spring/applicationContext-consumer.xml"})
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
