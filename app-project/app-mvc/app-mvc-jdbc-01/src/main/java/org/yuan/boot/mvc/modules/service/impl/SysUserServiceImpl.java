package org.yuan.boot.mvc.modules.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.modules.dao.SysUserDao;
import org.yuan.boot.mvc.modules.pojo.SysUser;
import org.yuan.boot.mvc.modules.repository.SysUserRepository;
import org.yuan.boot.mvc.modules.service.SysUserService;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:18
 **/
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserDao> implements SysUserService {
}
