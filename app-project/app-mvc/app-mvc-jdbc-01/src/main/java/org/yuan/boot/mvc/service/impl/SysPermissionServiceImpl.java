package org.yuan.boot.mvc.service.impl;

import cn.hutool.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysPermissionDao;
import org.yuan.boot.mvc.pojo.*;
import org.yuan.boot.mvc.pojo.converter.SysPermissionConverter;
import org.yuan.boot.mvc.pojo.dto.SysPermissionCondition;
import org.yuan.boot.mvc.pojo.vo.SysPermissionVo;
import org.yuan.boot.mvc.repository.SysPermissionRepository;
import org.yuan.boot.mvc.service.SysPermissionService;

import java.util.List;
import java.util.Optional;

@Service
public class SysPermissionServiceImpl extends BaseServiceImpl<SysPermission, SysPermissionRepository, SysPermissionDao> implements SysPermissionService {
    @Autowired
    private SysPermissionConverter sysPermissionConverter;


    @Override
    public Result selectPage(SysPermissionCondition condition) {
        return new PageResult<>(HttpStatus.HTTP_OK, "成功", baseDao().selectList(condition, condition.getPage(), condition.getSize()));
    }

    @Override
    public Result selectList(SysPermissionCondition condition) {
        List<SysPermission> list = baseDao().selectList(condition);
        return new IterableResult<>(HttpStatus.HTTP_OK, "成功", list);
    }

    @Override
    public Result selectOne(SysPermission permission) {
        Optional<SysPermission> optional = baseDao().selectOne(permission);
        return new DataResult<>(HttpStatus.HTTP_OK, "成功", optional);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result saveFromVo(SysPermissionVo sysPermissionVo) {
        SysPermission permission = sysPermissionConverter.convert(sysPermissionVo);
        this.save(permission);
        return new Result(HttpStatus.HTTP_OK, "成功");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result updateFromVo(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        update(sysPermission);
        return new Result(HttpStatus.HTTP_OK, "成功");
    }
}
