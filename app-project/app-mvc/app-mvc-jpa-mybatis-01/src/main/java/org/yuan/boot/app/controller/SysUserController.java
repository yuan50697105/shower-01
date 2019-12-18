package org.yuan.boot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.app.service.SysUserService;
import org.yuan.boot.mvc.controller.ResultController;

@RestControllerAdvice
@RestController
@RequestMapping("sys/user")
public class SysUserController extends ResultController {
    @Autowired
    private SysUserService sysUserService;
}
