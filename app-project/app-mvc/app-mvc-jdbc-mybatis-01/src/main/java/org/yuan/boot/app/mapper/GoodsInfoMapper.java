package org.yuan.boot.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.pojo.GoodsInfo;
import org.yuan.boot.jdbc.mapper.BaseMapper;

@Mapper
public interface GoodsInfoMapper extends BaseMapper<GoodsInfo> {
}
