package org.yuan.boot.mvc.service;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.SysRole;
import org.yuan.boot.mvc.pojo.dto.SysRoleCondition;
import org.yuan.boot.mvc.pojo.vo.SysRoleVo;

import java.util.List;
import java.util.Optional;

public interface SysRoleService extends BaseService<SysRole> {
    PagingResult<SysRole> selectPage(SysRoleCondition condition);

    List<SysRole> selectList(SysRoleCondition condition);

    Optional<SysRole> selectOne(SysRole sysRole);

    void saveFromVo(SysRoleVo sysRoleVo);

    void updateFromVo(SysRoleVo sysRoleVo);
}
