package org.yuan.boot.app.mvc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.app.mvc.pojo.condition.SysUserCondition;
import org.yuan.boot.app.mvc.pojo.example.SysUserExample;
import org.yuan.boot.db.mapper.BaseMapper;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    Long countByUsername(@Param("username") String username);

    List<SysUser> selectListByCondition(@Param("condition") SysUserCondition condition);

    List<SysUser> selectList(@Param("sysUser") SysUser sysUser);

    SysUser selectOne(@Param("sysUser") SysUser sysUser);
}