package org.yuan.boot.mvc.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.mvc.controller.ResultController;
import org.yuan.boot.mvc.modules.service.SysUserService;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:23
 **/
@RestController
@RequestMapping("/sys/user")
public class SysUserController extends ResultController {
    @Autowired
    private SysUserService sysUserService;

}
