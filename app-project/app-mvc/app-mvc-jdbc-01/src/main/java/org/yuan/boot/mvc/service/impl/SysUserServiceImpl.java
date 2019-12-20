package org.yuan.boot.mvc.service.impl;

import cn.hutool.http.HttpStatus;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysUserDao;
import org.yuan.boot.mvc.pojo.*;
import org.yuan.boot.mvc.pojo.converter.SysUserConverter;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.mvc.pojo.vo.SysUserVO;
import org.yuan.boot.mvc.repository.SysUserRepository;
import org.yuan.boot.mvc.service.SysUserService;

import java.time.LocalDateTime;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:18
 **/
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserDao> implements SysUserService {
    @Autowired
    private SysUserConverter sysUserConverter;

    @Override
    public Result selectPageList(SysUserCondition condition) {
        PagingResult<SysUser> result = baseDao().selectList(condition, condition.getPage(), condition.getSize());
        return new PageResult<>(HttpStatus.HTTP_OK, "成功", result);
    }

    @Override
    public Result selectList(SysUserCondition condition) {
        return new IterableResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectList(condition));
    }

    @Override
    public Result selectOne(SysUser sysUser) {
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectOne(sysUser));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result saveFromVo(SysUserVO sysUserVO) {
        SysUser sysUser = sysUserConverter.convert(sysUserVO);
        sysUser.setCreateTime(LocalDateTime.now());
        save(sysUser);
        return new Result(HttpStatus.HTTP_OK, "成功");
    }

    @Override
    public Result updateFromVo(SysUserVO sysUserVO) {
        SysUser sysUser = sysUserConverter.convert(sysUserVO);
        sysUser.setUpdateTime(LocalDateTime.now());
        update(sysUser);
        return new Result(HttpStatus.HTTP_OK, "成功");
    }
}
