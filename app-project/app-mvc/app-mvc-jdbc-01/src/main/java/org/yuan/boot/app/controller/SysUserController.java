package org.yuan.boot.app.controller;

import cn.hutool.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.app.pojo.dto.SysUserQueryCondition;
import org.yuan.boot.app.service.SysUserService;
import org.yuan.boot.mvc.controller.ResultController;
import org.yuan.boot.mvc.pojo.DataResult;
import org.yuan.boot.mvc.pojo.Result;

import java.util.Optional;

@RestControllerAdvice
@RestController
@RequestMapping("sys/user")
public class SysUserController extends ResultController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("data")
    public Result data(SysUserQueryCondition condition) {
        return sysUserService.selectPage(condition);
    }

    @GetMapping("list")
    public Result list(SysUserQueryCondition condition) {
        return sysUserService.selectList(condition);
    }

    @GetMapping("list/name/{name}")
    public Result listByName(@PathVariable(value = "name", required = false) @RequestParam(value = "name", required = false) String name) {

        return sysUserService.selectList(new SysUserQueryCondition().name(name));
    }

    @GetMapping("list/name")
    public Result listByName2(String name) {

        return listByName(name);
    }

    @GetMapping("get")
    public Result get(SysUser sysUser) {
        return sysUserService.selectOne(sysUser);
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        Optional<SysUser> sysUser = sysUserService.selectById(id);
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", sysUser);
    }

    @GetMapping(params = "id")
    public Result get2(Long id) {
        Optional<SysUser> sysUser = sysUserService.selectById(id);
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", sysUser);
    }

    @PostMapping
    public Result save(@RequestBody @Validated SysUser sysUser, BindingResult result) {
        validate(result);
        return sysUserService.saveFromVO(sysUser);
    }

    @PutMapping
    public Result update(@RequestBody @Validated SysUser sysUser, BindingResult result) {
        validate(result);
        sysUserService.update(sysUser);
        return ok();
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") Long id) {
        sysUserService.delete(id);
        return ok();
    }


}
