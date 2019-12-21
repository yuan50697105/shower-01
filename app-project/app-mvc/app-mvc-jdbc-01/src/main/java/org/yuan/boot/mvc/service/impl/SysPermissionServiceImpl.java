package org.yuan.boot.mvc.service.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysPermissionDao;
import org.yuan.boot.mvc.pojo.SysPermission;
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
    public PagingResult<SysPermission> selectPage(SysPermissionCondition condition) {
        return baseDao().selectList(condition, condition.getPage(), condition.getSize());
    }

    @Override
    public List<SysPermission> selectList(SysPermissionCondition condition) {
        return baseDao().selectList(condition);
    }

    @Override
    public Optional<SysPermission> selectOne(SysPermission permission) {
        return baseDao().selectOne(permission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveFromVo(SysPermissionVo sysPermissionVo) {
        SysPermission permission = sysPermissionConverter.convert(sysPermissionVo);
        this.save(permission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateFromVo(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        update(sysPermission);
    }


}
