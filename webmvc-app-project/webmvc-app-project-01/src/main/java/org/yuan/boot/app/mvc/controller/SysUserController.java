package org.yuan.boot.app.mvc.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.app.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.app.mvc.pojo.vo.SysUserVo;
import org.yuan.boot.app.mvc.service.SysUserService;
import org.yuan.boot.mvc.controller.ResultController;
import org.yuan.boot.mvc.db.pojo.PageResult;
import org.yuan.boot.mvc.pojo.DataResult;
import org.yuan.boot.mvc.pojo.Result;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sys/user")
public class SysUserController extends ResultController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("data")
    public Result data(SysUserCondition condition) {
        PageInfo<SysUser> pageInfo = sysUserService.selectPage(condition);
        return new PageResult<>(pageInfo);
    }

    @GetMapping("list")
    public Result list(SysUserCondition condition) {
        List<SysUser> list = sysUserService.selectList(condition);
        return new DataResult<>(list);
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        List<SysUser> list = sysUserService.selectList(new SysUserCondition().setName(name));
        return new DataResult<>(list);
    }

    @GetMapping("get")
    public Result get(SysUser sysUser) {
        Optional<SysUser> optional = sysUserService.selectOne(sysUser);
        return new DataResult<>(optional);
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        Optional<SysUser> optional = sysUserService.selectById(id);
        return new DataResult<>(optional);
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        sysUserService.saveFormVo(sysUserVo);
        return Result.ok();
    }

    @PutMapping
    @PostMapping("update")
    public Result update(@RequestBody @Validated SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        sysUserService.updateFromVo(sysUserVo);
        return Result.ok();
    }


    @GetMapping("{id}")
    public Result delete(@PathVariable("id") Long id) {
        sysUserService.delete(id);
        return Result.ok();
    }

    @GetMapping("delete")
    public Result delete(Long[] id) {
        sysUserService.delete(id);
        return Result.ok();
    }
}
