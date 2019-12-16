package org.yuan.boot.app.service;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.jpa.service.BaseService;

public interface SysUserService extends BaseService<SysUser> {
    PagingResult<SysUser> selectList(SysUser sysUser, int page, int size);
}
