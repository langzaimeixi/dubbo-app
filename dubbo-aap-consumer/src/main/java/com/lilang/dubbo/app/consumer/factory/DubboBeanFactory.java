package com.lilang.dubbo.app.consumer.factory;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.lilang.dubbo.app.consumer.service.InterfaceInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: lilang
 * Date: 2017/12/29 ProjectName: dubbo-app Version：5.0.0
 */
@Component
public class DubboBeanFactory {
    /**
     * dubbo application
     */
    @Autowired(required = false)
    private ApplicationConfig applicationConfig;

    /**
     * dubbo register
     */
    @Autowired(required = false)
    private List<RegistryConfig> registryConfig;


    public <T> T getDubboService(InterfaceInfoDO interfaceInfoDO) {
        ReferenceConfig<T> reference = new ReferenceConfig<>();
        reference.setApplication(applicationConfig);
        reference.setRegistries(registryConfig);
        reference.setRetries(0);//不允许重试
        reference.setInterface(interfaceInfoDO.getFullInterfaceName());
        //默认3s超时
        reference.setTimeout(3000);
        reference.setGroup(interfaceInfoDO.getGroup());
        reference.setCheck(true);
        T service = reference.get();
        return service;
    }

}
