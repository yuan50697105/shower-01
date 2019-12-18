package org.yuan.boot.app.dao.impl;

import org.springframework.stereotype.Repository;
import org.yuan.boot.app.dao.SysUserDao;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.jdbc.dao.impl.BaseDaoImpl;

@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao {
}
