package org.yuan.boot.app.dao.impl;


import org.springframework.stereotype.Repository;
import org.yuan.boot.app.dao.SysPermissionDao;
import org.yuan.boot.app.pojo.SysPermission;
import org.yuan.boot.db.jpa.dao.impl.BaseDaoImpl;

@Repository
public class SysPermissionDaoImpl extends BaseDaoImpl<SysPermission> implements SysPermissionDao {
}
