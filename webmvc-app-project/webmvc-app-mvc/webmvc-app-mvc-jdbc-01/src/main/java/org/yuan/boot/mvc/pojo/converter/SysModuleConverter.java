package org.yuan.boot.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.mvc.pojo.SysModule;
import org.yuan.boot.mvc.pojo.vo.SysModuleVo;

@Mapper(componentModel = "spring")
public interface SysModuleConverter {
    SysModule convert(SysModuleVo sysModuleVo);
}
