package org.yuan.boot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.mvc.pojo.Result;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.mvc.service.SysUserService;

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

    @GetMapping("/data")
    public Result data(SysUserCondition condition) {
        return sysUserService.selectPageList(condition);
    }

    @GetMapping("/list")
    public Result list(SysUserCondition condition) {
        return sysUserService.selectList(condition);
    }

    @GetMapping("/list/{name}")
    public Result listByName(@PathVariable("name") String name) {
        return sysUserService.selectList(new SysUserCondition().setName(name));
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return sysUserService.selectOne(new SysUser(id));
    }


}
