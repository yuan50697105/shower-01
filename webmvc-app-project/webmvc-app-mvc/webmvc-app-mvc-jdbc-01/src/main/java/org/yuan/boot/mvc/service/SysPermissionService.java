package org.yuan.boot.mvc.service;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.SysPermission;
import org.yuan.boot.mvc.pojo.dto.SysPermissionCondition;
import org.yuan.boot.mvc.pojo.vo.SysPermissionVo;

import java.util.List;
import java.util.Optional;

public interface SysPermissionService extends BaseService<SysPermission> {

    PagingResult<SysPermission> selectPage(SysPermissionCondition condition);

    List<SysPermission> selectList(SysPermissionCondition condition);

    Optional<SysPermission> selectOne(SysPermission permission);

    void saveFromVo(SysPermissionVo sysPermissionVo);

    void updateFromVo(SysPermissionVo sysPermissionVo);
}
