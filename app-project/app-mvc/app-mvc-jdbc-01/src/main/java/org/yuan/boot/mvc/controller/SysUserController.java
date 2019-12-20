package org.yuan.boot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.mvc.pojo.Result;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.mvc.pojo.vo.SysUserVO;
import org.yuan.boot.mvc.service.SysUserService;

import java.util.Arrays;

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

    @GetMapping("get")
    public Result get(SysUser sysUser) {
        return sysUserService.selectOne(sysUser);
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return sysUserService.selectOne(new SysUser(id));
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated SysUserVO sysUserVO, BindingResult result) {
        validate(result);
        return sysUserService.saveFromVo(sysUserVO);
    }

    @PutMapping
    @PostMapping("update")
    public Result update(SysUserVO sysUserVO, BindingResult result) {
        validate(result);
        return sysUserService.updateFromVo(sysUserVO);
    }

    @DeleteMapping({"{id}"})
    public Result deleteRest(@PathVariable("id") Long id) {
        sysUserService.delete(id);
        return ok();
    }

    @GetMapping(value = "delete")
    public Result delete(@RequestParam("id") Long[] ids) {
        sysUserService.delete(Arrays.asList(ids));
        return ok();
    }


}
