package org.yuan.boot.app.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.mvc.service.BaseCustomerInfoService;
import org.yuan.boot.mvc.controller.ResultController;

@RestController
@RequestMapping("base/customer/info")
public class BaseCustomerInfoController extends ResultController {
    @Autowired
    private BaseCustomerInfoService baseCustomerInfoService;
}
