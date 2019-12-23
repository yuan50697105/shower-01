package org.yuan.boot.app.mvc.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.mvc.mapper.SysModuleMapper;
import org.yuan.boot.app.mvc.pojo.SysModule;
import org.yuan.boot.app.mvc.service.SysModuleService;
import org.yuan.boot.db.service.impl.BaseServiceImpl;

@Service
public class SysModuleServiceImpl extends BaseServiceImpl<SysModule, SysModuleMapper> implements SysModuleService {
}
