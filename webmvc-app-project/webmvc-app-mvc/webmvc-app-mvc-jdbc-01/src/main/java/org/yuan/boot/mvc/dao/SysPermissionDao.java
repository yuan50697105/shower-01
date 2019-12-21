package org.yuan.boot.mvc.dao;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.jdbc.dao.BaseDao;
import org.yuan.boot.mvc.pojo.SysPermission;
import org.yuan.boot.mvc.pojo.dto.SysPermissionCondition;

import java.util.List;
import java.util.Optional;

public interface SysPermissionDao extends BaseDao<SysPermission> {
    PagingResult<SysPermission> selectList(SysPermissionCondition condition, int page, int size);

    List<SysPermission> selectList(SysPermissionCondition condition);

    Optional<SysPermission> selectOne(SysPermission permission);

}
