package org.yuan.boot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.mvc.service.SysPermissionService;

@RestController
@RequestMapping("/sys/permission")
public class SysPermissionController extends ResultController {
    @Autowired
    private SysPermissionService sysPermissionService;
}
