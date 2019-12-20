package org.yuan.boot.mvc.modules.dao.impl;

import org.springframework.stereotype.Repository;
import org.yuan.boot.db.jdbc.dao.impl.BaseDaoImpl;
import org.yuan.boot.mvc.modules.dao.SysUserDao;
import org.yuan.boot.mvc.modules.pojo.SysUser;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:10
 **/
@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao {
}
