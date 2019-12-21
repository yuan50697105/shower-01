package org.yuan.boot.mvc.service;

import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.Result;
import org.yuan.boot.mvc.pojo.SysPermission;
import org.yuan.boot.mvc.pojo.dto.SysPermissionCondition;
import org.yuan.boot.mvc.pojo.vo.SysPermissionVo;

public interface SysPermissionService extends BaseService<SysPermission> {

    Result selectPage(SysPermissionCondition condition);

    Result selectList(SysPermissionCondition condition);

    Result selectOne(SysPermission permission);

    Result saveFromVo(SysPermissionVo sysPermissionVo);

    Result updateFromVo(SysPermissionVo sysPermissionVo);
}
