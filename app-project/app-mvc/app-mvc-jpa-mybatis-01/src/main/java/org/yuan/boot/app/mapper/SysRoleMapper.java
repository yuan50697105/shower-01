package org.yuan.boot.app.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.pojo.SysRole;
import org.yuan.boot.db.jpa.mapper.BaseMapper;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
}
