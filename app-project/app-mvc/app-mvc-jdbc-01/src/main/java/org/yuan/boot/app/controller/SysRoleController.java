package org.yuan.boot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.pojo.dto.SysRoleQueryCondition;
import org.yuan.boot.app.service.SysRoleService;
import org.yuan.boot.mvc.pojo.Result;

@RestController
@RequestMapping("sys/role")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("data")
    public Result data(SysRoleQueryCondition condition) {
        return sysRoleService.selectPage(condition);
    }

    @GetMapping("list")
    public Result list(SysRoleQueryCondition condition) {
        return sysRoleService.selectList(condition);
    }


}
