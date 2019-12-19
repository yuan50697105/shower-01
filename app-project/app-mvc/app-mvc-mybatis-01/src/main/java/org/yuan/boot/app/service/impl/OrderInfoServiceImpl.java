package org.yuan.boot.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.OrderInfoMapper;
import org.yuan.boot.app.pojo.OrderInfo;
import org.yuan.boot.app.service.OrderInfoService;
import org.yuan.boot.db.mybatis.service.impl.BaseServiceImpl;

@Service
public class OrderInfoServiceImpl extends BaseServiceImpl<OrderInfo, OrderInfoMapper> implements OrderInfoService {
}
