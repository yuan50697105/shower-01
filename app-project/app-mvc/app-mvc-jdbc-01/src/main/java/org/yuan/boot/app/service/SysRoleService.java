package org.yuan.boot.app.service;

import org.yuan.boot.app.pojo.SysRole;
import org.yuan.boot.app.pojo.dto.SysRoleQueryCondition;
import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.Result;

public interface SysRoleService extends BaseService<SysRole> {
    Result selectPage(SysRoleQueryCondition condition);

    Result selectList(SysRoleQueryCondition condition);
}
