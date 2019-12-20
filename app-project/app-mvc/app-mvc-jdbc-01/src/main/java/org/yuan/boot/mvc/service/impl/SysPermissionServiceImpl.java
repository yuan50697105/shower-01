package org.yuan.boot.mvc.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysPermissionDao;
import org.yuan.boot.mvc.pojo.SysPermission;
import org.yuan.boot.mvc.repository.SysPermissionRepository;
import org.yuan.boot.mvc.service.SysPermissionService;

@Service
public class SysPermissionServiceImpl extends BaseServiceImpl<SysPermission, SysPermissionRepository, SysPermissionDao> implements SysPermissionService {
}
