package org.yuan.boot.mvc.controller;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.mvc.pojo.*;
import org.yuan.boot.mvc.pojo.dto.SysPermissionCondition;
import org.yuan.boot.mvc.pojo.vo.SysPermissionVo;
import org.yuan.boot.mvc.service.SysPermissionService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sys/permission")
public class SysPermissionController extends ResultController {
    @Autowired
    private SysPermissionService sysPermissionService;

    @GetMapping("data")
    public Result data(SysPermissionCondition condition) {
        PagingResult<SysPermission> pagingResult = sysPermissionService.selectPage(condition);
        return new PageResult<>(pagingResult);
    }

    @GetMapping("list")
    public Result list(SysPermissionCondition condition) {
        List<SysPermission> list = sysPermissionService.selectList(condition);
        return new IterableResult<>(list);
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        List<SysPermission> list = sysPermissionService.selectList(new SysPermissionCondition().setName(name));
        return new IterableResult<>(list);
    }

    @GetMapping("get")
    public Result get(SysPermission permission) {
        Optional<SysPermission> optional = sysPermissionService.selectOne(permission);
        return new DataResult<>(optional);
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        Optional<SysPermission> permission = sysPermissionService.selectById(id);
        return new DataResult<>(permission);
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated SysPermissionVo sysPermissionVo, BindingResult result) {
        validate(result);
        sysPermissionService.saveFromVo(sysPermissionVo);
        return Result.ok();
    }

    @PutMapping
    @PostMapping("update")
    public Result update(@RequestBody @Validated SysPermissionVo sysPermissionVo, BindingResult result) {
        validate(result);
        sysPermissionService.updateFromVo(sysPermissionVo);
        return Result.ok();
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") Long id) {
        sysPermissionService.delete(id);
        return Result.ok();
    }

    @GetMapping("delete")
    public Result delete(Long[] id) {
        sysPermissionService.delete(Arrays.asList(id));
        return Result.ok();
    }
}
