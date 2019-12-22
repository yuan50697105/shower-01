package org.yuan.boot.app.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.mvc.service.SysRoleService;
import org.yuan.boot.mvc.controller.ResultController;

@RestController
@RequestMapping("sys/role")
public class SysRoleController extends ResultController {
    @Autowired
    private SysRoleService sysRoleService;
}
