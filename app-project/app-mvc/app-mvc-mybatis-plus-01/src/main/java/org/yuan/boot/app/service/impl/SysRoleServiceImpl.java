package org.yuan.boot.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.SysRoleMapper;
import org.yuan.boot.app.pojo.SysRole;
import org.yuan.boot.app.service.SysRoleService;
import org.yuan.boot.db.mybatis.service.impl.BaseServiceImpl;

@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleMapper> implements SysRoleService {
}
