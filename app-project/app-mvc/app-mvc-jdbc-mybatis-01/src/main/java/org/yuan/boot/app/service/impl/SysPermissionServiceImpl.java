package org.yuan.boot.app.service.impl;


import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.SysPermissionMapper;
import org.yuan.boot.app.pojo.SysPermission;
import org.yuan.boot.app.repository.SysPermissionRepository;
import org.yuan.boot.app.service.SysPermissionService;
import org.yuan.boot.jdbc.service.impl.BaseServiceImpl;

@Service
public class SysPermissionServiceImpl extends BaseServiceImpl<SysPermission, SysPermissionRepository, SysPermissionMapper> implements SysPermissionService {
}
