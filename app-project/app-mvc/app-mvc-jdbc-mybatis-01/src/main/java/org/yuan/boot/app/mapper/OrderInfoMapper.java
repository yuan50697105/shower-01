package org.yuan.boot.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.pojo.OrderInfo;
import org.yuan.boot.jdbc.mapper.BaseMapper;

@Mapper
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
}
