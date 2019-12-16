package org.yuan.boot.app.controller;

import cn.hutool.http.HttpStatus;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.app.service.SysUserService;
import org.yuan.boot.mvc.controller.ResultController;
import org.yuan.boot.mvc.jpa.pojo.PageResult;
import org.yuan.boot.mvc.pojo.Result;

@RestController
//@RequestMapping("sys/user")
public class SysUserController extends ResultController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping
    public PageResult<SysUser> page(SysUser sysUser,
                                    @RequestParam(defaultValue = "1") int page,
                                    @RequestParam(defaultValue = "20") int size) {
        PagingResult<SysUser> result = sysUserService.selectList(sysUser, page, size);
        return new PageResult<>(HttpStatus.HTTP_OK, "成功", result);
    }

    @PostMapping
    public Result<SysUser> save(@RequestBody SysUser sysUser) {
        SysUser save = sysUserService.save(sysUser);
        return new Result<>(HttpStatus.HTTP_OK, "成功", save);
    }
}
