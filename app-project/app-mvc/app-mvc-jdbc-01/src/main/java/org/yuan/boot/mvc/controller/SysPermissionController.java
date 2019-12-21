package org.yuan.boot.mvc.controller;

import cn.hutool.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.mvc.pojo.DataResult;
import org.yuan.boot.mvc.pojo.Result;
import org.yuan.boot.mvc.pojo.SysPermission;
import org.yuan.boot.mvc.pojo.dto.SysPermissionCondition;
import org.yuan.boot.mvc.pojo.vo.SysPermissionVo;
import org.yuan.boot.mvc.service.SysPermissionService;

import java.util.Arrays;
import java.util.Optional;

@RestController
@RequestMapping("/sys/permission")
public class SysPermissionController extends ResultController {
    @Autowired
    private SysPermissionService sysPermissionService;

    @GetMapping("data")
    public Result data(SysPermissionCondition condition) {
        return sysPermissionService.selectPage(condition);
    }

    @GetMapping("list")
    public Result list(SysPermissionCondition condition) {
        return sysPermissionService.selectList(condition);
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        return sysPermissionService.selectList(new SysPermissionCondition().setName(name));
    }

    @GetMapping("get")
    public Result get(SysPermission permission) {
        return sysPermissionService.selectOne(permission);
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        Optional<SysPermission> permission = sysPermissionService.selectById(id);
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", permission);
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated SysPermissionVo sysPermissionVo, BindingResult result) {
        validate(result);
        return sysPermissionService.saveFromVo(sysPermissionVo);
    }

    @PutMapping
    @PostMapping("update")
    public Result update(@RequestBody @Validated SysPermissionVo sysPermissionVo, BindingResult result) {
        validate(result);
        return sysPermissionService.updateFromVo(sysPermissionVo);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") Long id) {
        sysPermissionService.delete(id);
        return new Result(HttpStatus.HTTP_OK, "成功");
    }

    @GetMapping("delete")
    public Result delete(Long[] id) {
        sysPermissionService.delete(Arrays.asList(id));
        return new Result(HttpStatus.HTTP_OK, "成功");
    }
}
