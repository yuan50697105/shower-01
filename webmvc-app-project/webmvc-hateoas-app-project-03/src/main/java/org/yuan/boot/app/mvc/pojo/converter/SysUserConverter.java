package org.yuan.boot.app.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.app.mvc.pojo.vo.SysUserVo;

@Mapper(componentModel = "spring")
public interface SysUserConverter {
    SysUser convert(SysUserVo sysUserVo);
}
