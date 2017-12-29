package com.lilang.dubbo.app.consumer.service;

import com.lilang.dubbo.app.provider.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author: lilang
 * Date: 2017/12/29 ProjectName: dubbo-app Version：5.0.0
 */
@Component
public class InterfaceInfoService {

    public InterfaceInfoDO getInterfaceInfoByName(String name) {
        //可以创建一个表，存到数据库，根据name查询接口全称或者需要的其它值
        InterfaceInfoDO infoDO = new InterfaceInfoDO();
        if ("lilang".equals(name)) {
            infoDO.setFullInterfaceName(HelloService.class.getName());
            infoDO.setGroup("lilang");
        }
        if ("gaoaijia".equals(name)) {

            infoDO.setFullInterfaceName(HelloService.class.getName());
            infoDO.setGroup("gaoaijia");
        }
        return infoDO;
    }

}
