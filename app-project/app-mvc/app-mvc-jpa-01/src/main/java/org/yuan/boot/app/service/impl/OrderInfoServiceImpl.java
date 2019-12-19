package org.yuan.boot.app.service.impl;


import org.springframework.stereotype.Service;
import org.yuan.boot.app.dao.OrderInfoDao;
import org.yuan.boot.app.pojo.OrderInfo;
import org.yuan.boot.app.repository.OrderInfoRepository;
import org.yuan.boot.app.service.OrderInfoService;
import org.yuan.boot.db.jpa.service.impl.BaseServiceImpl;

@Service
public class OrderInfoServiceImpl extends BaseServiceImpl<OrderInfo, OrderInfoRepository, OrderInfoDao> implements OrderInfoService {
}
