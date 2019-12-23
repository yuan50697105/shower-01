package org.yuan.boot.app.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.app.mvc.pojo.SysPermission;
import org.yuan.boot.app.mvc.pojo.vo.SysPermissionVo;

@Mapper(componentModel = "spring")
public interface SysPermissionConverter {
    SysPermission convert(SysPermissionVo sysPermissionVo);
}
