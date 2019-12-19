package org.yuan.boot.app.service;

import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.app.pojo.dto.SysUserQueryCondition;
import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.Result;

public interface SysUserService extends BaseService<SysUser> {
    Result selectPage(SysUserQueryCondition condition);

    Result selectList(SysUserQueryCondition condition);

    Result selectOne(SysUser sysUser);

    Result saveFromVO(SysUser sysUser);

}
