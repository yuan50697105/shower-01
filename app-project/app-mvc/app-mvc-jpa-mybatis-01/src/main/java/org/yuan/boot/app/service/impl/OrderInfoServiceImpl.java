package org.yuan.boot.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.OrderInfoMapper;
import org.yuan.boot.app.pojo.OrderInfo;
import org.yuan.boot.app.repository.OrderInfoRepository;
import org.yuan.boot.app.service.OrderInfoService;
import org.yuan.boot.db.jpa.service.impl.BaseServiceImpl;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-17 12:34
 **/
@Service
public class OrderInfoServiceImpl extends BaseServiceImpl<OrderInfo, OrderInfoRepository, OrderInfoMapper> implements OrderInfoService {
}
