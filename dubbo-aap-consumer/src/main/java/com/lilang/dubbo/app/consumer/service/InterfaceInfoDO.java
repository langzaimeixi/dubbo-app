package com.lilang.dubbo.app.consumer.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: lilang
 * Date: 2017/12/29 ProjectName: dubbo-app Version：5.0.0
 */
@Getter
@Setter
@ToString
public class InterfaceInfoDO {

    private Long id;

    private String name;

    private String fullInterfaceName;

    private String group;

}
