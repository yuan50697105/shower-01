package org.yuan.boot.mvc.service;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.SysModule;
import org.yuan.boot.mvc.pojo.dto.SysModuleCondition;
import org.yuan.boot.mvc.pojo.vo.SysModuleVo;

import java.util.List;
import java.util.Optional;

public interface SysModuleService extends BaseService<SysModule> {
    PagingResult<SysModule> selectPage(SysModuleCondition condition);

    List<SysModule> selectList(SysModuleCondition condition);

    Optional<SysModule> selectOne(SysModule sysModule);

    void saveFormVo(SysModuleVo sysModuleVo);

    void updateFromVo(SysModuleVo sysModuleVo);
}
