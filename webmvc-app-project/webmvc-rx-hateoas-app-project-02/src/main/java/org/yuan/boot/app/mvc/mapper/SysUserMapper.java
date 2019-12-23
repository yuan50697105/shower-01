package org.yuan.boot.app.mvc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.app.mvc.pojo.condition.SysUserCondition;
import org.yuan.boot.db.mapper.BaseMapper;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    Long countByUsername(@Param("username") String username);

    List<SysUser> selectListByCondition(@Param("condition") SysUserCondition condition);

    List<SysUser> selectList(@Param("sysUser") SysUser sysUser);

}