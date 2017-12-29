package com.lilang.dubbo.app.consumer.controller;

import com.lilang.dubbo.app.consumer.factory.DubboBeanFactory;
import com.lilang.dubbo.app.consumer.service.InterfaceInfoDO;
import com.lilang.dubbo.app.consumer.service.InterfaceInfoService;
import com.lilang.dubbo.app.provider.service.HelloService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lilang
 * Date: 2017/12/28 ProjectName: dubbo-app Version：5.0.0
 */
@Log4j2
@RestController
public class HelloController {

    @Autowired
    private DubboBeanFactory dubboBeanFactory;

    @Autowired
    private InterfaceInfoService interfaceInfoService;


    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        InterfaceInfoDO infoDO = interfaceInfoService.getInterfaceInfoByName(name);
        HelloService service = dubboBeanFactory.getDubboService(infoDO);
        return service.sayHello(name);
    }

}
