package org.yuan.boot.mvc.service.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysRoleDao;
import org.yuan.boot.mvc.pojo.SysRole;
import org.yuan.boot.mvc.pojo.converter.SysRoleConverter;
import org.yuan.boot.mvc.pojo.dto.SysRoleCondition;
import org.yuan.boot.mvc.pojo.vo.SysRoleVo;
import org.yuan.boot.mvc.repository.SysRoleRepository;
import org.yuan.boot.mvc.service.SysRoleService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleRepository, SysRoleDao> implements SysRoleService {
    @Autowired
    private SysRoleConverter sysRoleConverter;

    @Override
    public PagingResult<SysRole> selectPage(SysRoleCondition condition) {
        return baseDao().selectList(condition, condition.getPage(), condition.getSize());
    }

    @Override
    public List<SysRole> selectList(SysRoleCondition condition) {
        return baseDao().selectList(condition);
    }

    @Override
    public Optional<SysRole> selectOne(SysRole sysRole) {
        return baseDao().selectOne(sysRole);
    }

    @Override
    public void saveFromVo(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setCreateTime(LocalDateTime.now());
        save(sysRole);
    }

    @Override
    public void updateFromVo(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setUpdateTime(LocalDateTime.now());
        update(sysRole);
    }
}
