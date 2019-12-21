package org.yuan.boot.mvc.service.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysModuleDao;
import org.yuan.boot.mvc.pojo.SysModule;
import org.yuan.boot.mvc.pojo.dto.SysModuleCondition;
import org.yuan.boot.mvc.pojo.vo.SysModuleVo;
import org.yuan.boot.mvc.repository.SysModuleRepository;
import org.yuan.boot.mvc.service.SysModuleService;

import java.util.List;
import java.util.Optional;

@Service
public class SysModuleServiceImpl extends BaseServiceImpl<SysModule, SysModuleRepository, SysModuleDao> implements SysModuleService {
    @Override
    public PagingResult<SysModule> selectPage(SysModuleCondition condition) {
        return null;
    }

    @Override
    public List<SysModule> selectList(SysModuleCondition condition) {
        return null;
    }

    @Override
    public Optional<SysModule> selectOne(SysModule sysModule) {
        return Optional.empty();
    }

    @Override
    public void saveFormVo(SysModuleVo sysModuleVo) {

    }

    @Override
    public void updateFromVo(SysModuleVo sysModuleVo) {

    }
}
