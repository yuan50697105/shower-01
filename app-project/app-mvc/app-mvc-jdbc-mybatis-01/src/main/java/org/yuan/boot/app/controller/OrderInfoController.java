package org.yuan.boot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.service.OrderInfoService;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-17 12:35
 **/
@RestController
@RequestMapping("order/info")
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;
}
