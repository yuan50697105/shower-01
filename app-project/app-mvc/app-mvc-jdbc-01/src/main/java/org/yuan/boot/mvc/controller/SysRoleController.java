package org.yuan.boot.mvc.controller;

import cn.hutool.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.mvc.pojo.DataResult;
import org.yuan.boot.mvc.pojo.Result;
import org.yuan.boot.mvc.pojo.SysRole;
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
        return sysRoleService.selectPage(condition);
    }

    @GetMapping("list")
    public Result list(SysRoleCondition condition) {
        return sysRoleService.selectList(condition);
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        return sysRoleService.selectList(new SysRoleCondition().setName(name));
    }


    @GetMapping("get")
    public Result get(SysRole sysRole) {
        return sysRoleService.selectOne(sysRole);
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", sysRoleService.selectOne(new SysRole(id)));
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.saveFromVo(sysRoleVo);
    }

    @PutMapping
    @PostMapping("update")
    public Result update(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.updateFromVo(sysRoleVo);
    }

    @DeleteMapping("{id}")
    @GetMapping(value = "delete", params = "id")
    public Result delete(@PathVariable("id") Long id) {
        sysRoleService.delete(id);
        return ok();
    }

    @GetMapping("delete")
    public Result delete(@RequestParam("id") Long[] ids) {
        sysRoleService.delete(Arrays.asList(ids));
        return ok();
    }

}
