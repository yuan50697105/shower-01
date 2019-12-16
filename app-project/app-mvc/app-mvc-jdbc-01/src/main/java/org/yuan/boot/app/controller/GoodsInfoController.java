package org.yuan.boot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.service.GoodsInfoService;

@RestController
@RequestMapping("goods/info")
public class GoodsInfoController {
    @Autowired
    private GoodsInfoService goodsInfoService;
}
