package org.yuan.boot.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.mvc.pojo.SysPermission;
import org.yuan.boot.mvc.pojo.vo.SysPermissionVo;

@Mapper(componentModel = "spring")
public interface SysPermissionConverter {
    @SuppressWarnings("UnmappedTargetProperties")
    SysPermission convert(SysPermissionVo sysPermissionVo);
}
