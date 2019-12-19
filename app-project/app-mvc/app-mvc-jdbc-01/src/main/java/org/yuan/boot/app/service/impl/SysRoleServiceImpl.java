package org.yuan.boot.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.dao.SysRoleDao;
import org.yuan.boot.app.pojo.SysRole;
import org.yuan.boot.app.pojo.dto.SysRoleQueryCondition;
import org.yuan.boot.app.repository.SysRoleRepository;
import org.yuan.boot.app.service.SysRoleService;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.pojo.Result;

@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleRepository, SysRoleDao> implements SysRoleService {
    @Override
    public Result selectPage(SysRoleQueryCondition condition) {
        return null;
    }

    @Override
    public Result selectList(SysRoleQueryCondition condition) {
        return null;
    }
}
