package org.yuan.boot.app.service.impl;


import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.SysModuleMapper;
import org.yuan.boot.app.pojo.SysModule;
import org.yuan.boot.app.repository.SysModuleRepository;
import org.yuan.boot.app.service.SysModuleService;
import org.yuan.boot.jpa.service.impl.BaseServiceImpl;

@Service
public class SysModuleServiceImpl extends BaseServiceImpl<SysModule, SysModuleRepository, SysModuleMapper> implements SysModuleService {
}
