package org.yuan.boot.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.pojo.SysUser;

import java.util.List;

@Mapper
public interface SysUserMapper {
    int insert(SysUser sysUser);

    int insertSelective(SysUser sysUser);


    List<SysUser> selectList(SysUser sysUser);

}
