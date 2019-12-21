package org.yuan.boot.mvc.controller;

import cn.hutool.http.HttpStatus;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.mvc.pojo.*;
import org.yuan.boot.mvc.pojo.dto.SysModuleCondition;
import org.yuan.boot.mvc.pojo.vo.SysModuleVo;
import org.yuan.boot.mvc.service.SysModuleService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sys/module")
public class SysModuleController extends ResultController {
    @Autowired
    private SysModuleService sysModuleService;

    @GetMapping("data")
    public Result data(SysModuleCondition condition) {
        PagingResult<SysModule> pagingResult = sysModuleService.selectPage(condition);
        return new PageResult<>(HttpStatus.HTTP_OK, "成功", pagingResult);
    }

    @GetMapping("list")
    public Result list(SysModuleCondition condition) {
        List<SysModule> list = sysModuleService.selectList(condition);
        return new IterableResult<>(HttpStatus.HTTP_OK, "成功", list);
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        List<SysModule> list = sysModuleService.selectList(new SysModuleCondition().setName(name));
        return new IterableResult<>(HttpStatus.HTTP_OK, "成功", list);
    }

    @GetMapping("get")
    public Result get(SysModule sysModule) {
        Optional<SysModule> optional = sysModuleService.selectOne(sysModule);
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", optional);
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return new DataResult<>(sysModuleService.selectById(id));
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated SysModuleVo sysModuleVo, BindingResult result) {
        validate(result);
        sysModuleService.saveFormVo(sysModuleVo);
        return Result.ok();
    }

    @PutMapping
    @PostMapping("update")
    public Result update(@RequestBody @Validated SysModuleVo sysModuleVo, BindingResult result) {
        validate(result);
        sysModuleService.updateFromVo(sysModuleVo);
        return Result.ok();
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") Long id) {
        sysModuleService.delete(id);
        return Result.ok();
    }

    @GetMapping("delete")
    public Result delete(@RequestParam("id") Long[] ids) {
        sysModuleService.delete(Arrays.asList(ids));
        return Result.ok();
    }
}
