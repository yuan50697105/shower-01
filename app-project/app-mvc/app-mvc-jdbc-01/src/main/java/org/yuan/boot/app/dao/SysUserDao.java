package org.yuan.boot.app.dao;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.jdbc.dao.BaseDao;

public interface SysUserDao extends BaseDao<SysUser> {
    PagingResult<SysUser> selectList(SysUser sysUser, int page, int size);
}
