package org.yuan.boot.mvc.service;

import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.Result;
import org.yuan.boot.mvc.pojo.SysRole;
import org.yuan.boot.mvc.pojo.dto.SysRoleCondition;
import org.yuan.boot.mvc.pojo.vo.SysRoleVo;

public interface SysRoleService extends BaseService<SysRole> {
    Result selectPage(SysRoleCondition condition);

    Result selectList(SysRoleCondition condition);

    Result selectOne(SysRole sysRole);

    Result saveFromVo(SysRoleVo sysRoleVo);

    Result updateFromVo(SysRoleVo sysRoleVo);
}
