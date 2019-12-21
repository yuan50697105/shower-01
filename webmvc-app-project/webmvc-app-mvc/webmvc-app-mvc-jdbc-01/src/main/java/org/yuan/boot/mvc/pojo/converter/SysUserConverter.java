package org.yuan.boot.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.vo.SysUserVO;


@Mapper(componentModel = "spring")
public interface SysUserConverter {
    @SuppressWarnings("UnmappedTargetProperties")
    SysUser convert(SysUserVO sysUserVO);
}
