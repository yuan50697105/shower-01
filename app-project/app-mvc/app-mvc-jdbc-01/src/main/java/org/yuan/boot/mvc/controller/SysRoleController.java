package org.yuan.boot.mvc.controller;

import cn.hutool.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.mvc.pojo.*;
import org.yuan.boot.mvc.pojo.dto.SysRoleCondition;
import org.yuan.boot.mvc.pojo.vo.SysRoleVo;
import org.yuan.boot.mvc.service.SysRoleService;

import java.util.Arrays;

@RestController
@RequestMapping("/sys/role")
public class SysRoleController extends ResultController {
    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("data")
    public Result date(SysRoleCondition condition) {
        return new PageResult<>(HttpStatus.HTTP_OK, "成功", sysRoleService.selectPage(condition));
    }

    @GetMapping("list")
    public Result list(SysRoleCondition condition) {
        return new IterableResult<>(sysRoleService.selectList(condition));
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        return new IterableResult<>(sysRoleService.selectList(new SysRoleCondition().setName(name)));
    }


    @GetMapping("get")
    public Result get(SysRole sysRole) {
        return new DataResult<>(sysRoleService.selectOne(sysRole));
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", sysRoleService.selectOne(new SysRole(id)));
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        sysRoleService.saveFromVo(sysRoleVo);
        return Result.ok();
    }

    @PutMapping
    @PostMapping("update")
    public Result update(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        sysRoleService.updateFromVo(sysRoleVo);
        return Result.ok();
    }

    @DeleteMapping("{id}")
    @GetMapping(value = "delete", params = "id")
    public Result delete(@PathVariable("id") Long id) {
        sysRoleService.delete(id);
        return Result.ok();
    }

    @GetMapping("delete")
    public Result delete(@RequestParam("id") Long[] ids) {
        sysRoleService.delete(Arrays.asList(ids));
        return Result.ok();
    }

}
