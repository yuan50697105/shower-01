package org.yuan.boot.app.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.app.mvc.pojo.SysModule;
import org.yuan.boot.app.mvc.pojo.vo.SysModuleVo;

@Mapper(componentModel = "spring")
public interface SysModuleConvrter {
    SysModule convert(SysModuleVo sysModuleVo);
}
