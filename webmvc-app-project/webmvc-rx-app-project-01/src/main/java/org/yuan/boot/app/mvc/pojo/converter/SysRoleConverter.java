package org.yuan.boot.app.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.app.mvc.pojo.SysRole;
import org.yuan.boot.app.mvc.pojo.vo.SysRoleVo;

@Mapper(componentModel = "spring")
public interface SysRoleConverter {
    SysRole convert(SysRoleVo sysRoleVo);
}
