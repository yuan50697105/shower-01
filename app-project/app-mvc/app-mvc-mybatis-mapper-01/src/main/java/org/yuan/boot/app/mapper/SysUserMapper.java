package org.yuan.boot.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.mybatis.mapper.BaseMapper;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
