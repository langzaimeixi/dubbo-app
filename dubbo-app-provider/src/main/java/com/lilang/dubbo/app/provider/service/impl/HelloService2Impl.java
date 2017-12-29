package com.lilang.dubbo.app.provider.service.impl;

import com.lilang.dubbo.app.provider.service.HelloService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author: lilang
 * Date: 2017/12/29 ProjectName: dubbo-app Version：5.0.0
 */
@Log4j2
@Component
public class HelloService2Impl implements HelloService {

    @Override
    public String sayHello(String name) {
        log.info("say hello2, name={}", name);
        return "say hello2 to " + name;
    }
}
