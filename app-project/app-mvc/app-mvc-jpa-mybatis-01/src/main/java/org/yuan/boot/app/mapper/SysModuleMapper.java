package org.yuan.boot.app.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.pojo.SysModule;
import org.yuan.boot.db.jpa.mapper.BaseMapper;

@Mapper
public interface SysModuleMapper extends BaseMapper<SysModule> {
}
