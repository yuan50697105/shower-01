package org.yuan.boot.app.mvc.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.mvc.mapper.SysRoleMapper;
import org.yuan.boot.app.mvc.pojo.SysRole;
import org.yuan.boot.app.mvc.service.SysRoleService;
import org.yuan.boot.db.service.impl.BaseServiceImpl;

@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleMapper> implements SysRoleService {
}
