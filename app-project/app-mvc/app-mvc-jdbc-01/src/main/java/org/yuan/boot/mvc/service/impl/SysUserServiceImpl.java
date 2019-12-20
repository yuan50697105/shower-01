package org.yuan.boot.mvc.service.impl;

import cn.hutool.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysUserDao;
import org.yuan.boot.mvc.pojo.*;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.mvc.repository.SysUserRepository;
import org.yuan.boot.mvc.service.SysUserService;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:18
 **/
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserDao> implements SysUserService {
    @Override
    public Result selectPageList(SysUserCondition condition) {
        return new PageResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectList(condition, condition.getPage(), condition.getSize()));
    }

    @Override
    public Result selectList(SysUserCondition condition) {
        return new IterableResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectList(condition));
    }

    @Override
    public Result selectOne(SysUser sysUser) {
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectOne(sysUser));
    }
}
