package com.zjd.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjd.OrderService;

/**
 * Created by zjd on 2020/3/11.
 */
@Service(version = "1.0.0",timeout = 3000)
public class OrderServiceImpl implements OrderService
{
    @Override
    public String order() {
        return "ok";
    }
}
