package org.yuan.boot.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.dao.SysUserDao;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.app.pojo.dto.SysUserQueryCondition;
import org.yuan.boot.app.repository.SysUserRepository;
import org.yuan.boot.app.service.SysUserService;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.pojo.Result;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserDao> implements SysUserService {
    @Override
    public Result selectPage(SysUserQueryCondition condition) {
        return null;
    }

    @Override
    public Result selectList(SysUserQueryCondition condition) {
        return null;
    }

    @Override
    public Result selectOne(SysUser sysUser) {
        return null;
    }

    @Override
    public Result saveFromVO(SysUser sysUser) {
        return null;
    }
}
