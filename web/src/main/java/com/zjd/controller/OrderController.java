package com.zjd.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjd.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjd on 2020/3/11.
 */
@RestController(value = "/")
public class OrderController {
    @Reference(version = "1.0.0",timeout = 2000)
    private OrderService orderService;

    @GetMapping(value = "order")
    public void order(){
        System.out.println(orderService.order());
    }
}
