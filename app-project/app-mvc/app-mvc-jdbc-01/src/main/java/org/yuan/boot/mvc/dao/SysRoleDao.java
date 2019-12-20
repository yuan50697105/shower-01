package org.yuan.boot.mvc.dao;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.jdbc.dao.BaseDao;
import org.yuan.boot.mvc.pojo.SysRole;
import org.yuan.boot.mvc.pojo.dto.SysRoleCondition;

import java.util.List;
import java.util.Optional;

public interface SysRoleDao extends BaseDao<SysRole> {
    PagingResult<SysRole> selectList(SysRoleCondition condition, int page, int size);

    List<SysRole> selectList(SysRoleCondition condition);

    Optional<SysRole> selectOne(SysRole sysRole);
}
