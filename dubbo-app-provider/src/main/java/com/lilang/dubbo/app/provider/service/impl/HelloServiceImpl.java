package com.lilang.dubbo.app.provider.service.impl;

import com.lilang.dubbo.app.provider.service.HelloService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author: lilang
 * Date: 2017/12/28 ProjectName: dubbo-app Version：5.0.0
 */
@Log4j2
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        log.info("sayhello, name={}", name);
        return "say hello to " + name;
    }
}
