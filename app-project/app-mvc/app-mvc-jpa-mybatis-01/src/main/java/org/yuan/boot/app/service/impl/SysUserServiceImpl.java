package org.yuan.boot.app.service.impl;


import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.SysUserMapper;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.app.repository.SysUserRepository;
import org.yuan.boot.app.service.SysUserService;
import org.yuan.boot.jpa.service.impl.BaseServiceImpl;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserMapper> implements SysUserService {
}
