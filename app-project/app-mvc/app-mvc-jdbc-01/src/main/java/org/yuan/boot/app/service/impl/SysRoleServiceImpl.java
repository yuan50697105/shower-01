package org.yuan.boot.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.dao.SysRoleDao;
import org.yuan.boot.app.pojo.SysRole;
import org.yuan.boot.app.repository.SysRoleRepository;
import org.yuan.boot.app.service.SysRoleService;
import org.yuan.boot.jdbc.service.impl.BaseServiceImpl;

@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleRepository, SysRoleDao> implements SysRoleService {
}
