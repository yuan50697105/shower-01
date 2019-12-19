package org.yuan.boot.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.pojo.SysPermission;
import org.yuan.boot.db.jdbc.mapper.BaseMapper;

@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
}
