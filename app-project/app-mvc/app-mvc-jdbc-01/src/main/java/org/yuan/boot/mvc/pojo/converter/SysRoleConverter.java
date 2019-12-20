package org.yuan.boot.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.mvc.pojo.SysRole;
import org.yuan.boot.mvc.pojo.vo.SysRoleVo;

@Mapper(componentModel = "spring")
public interface SysRoleConverter {
    @SuppressWarnings("UnmappedTargetProperties")
    SysRole convert(SysRoleVo sysRoleVo);
}
