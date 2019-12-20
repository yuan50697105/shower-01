package org.yuan.boot.mvc.service.impl;

import cn.hutool.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysRoleDao;
import org.yuan.boot.mvc.pojo.*;
import org.yuan.boot.mvc.pojo.converter.SysRoleConverter;
import org.yuan.boot.mvc.pojo.dto.SysRoleCondition;
import org.yuan.boot.mvc.pojo.vo.SysRoleVo;
import org.yuan.boot.mvc.repository.SysRoleRepository;
import org.yuan.boot.mvc.service.SysRoleService;

import java.time.LocalDateTime;

@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleRepository, SysRoleDao> implements SysRoleService {
    @Autowired
    private SysRoleConverter sysRoleConverter;

    @Override
    public Result selectPage(SysRoleCondition condition) {
        return new PageResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectList(condition, condition.getPage(), condition.getSize()));
    }

    @Override
    public Result selectList(SysRoleCondition condition) {
        return new IterableResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectList(condition));
    }

    @Override
    public Result selectOne(SysRole sysRole) {
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectOne(sysRole));
    }

    @Override
    public Result saveFromVo(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setCreateTime(LocalDateTime.now());
        save(sysRole);
        return new Result(HttpStatus.HTTP_OK, "成功");
    }

    @Override
    public Result updateFromVo(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setUpdateTime(LocalDateTime.now());
        update(sysRole);
        return new Result(HttpStatus.HTTP_OK, "成功");
    }
}
