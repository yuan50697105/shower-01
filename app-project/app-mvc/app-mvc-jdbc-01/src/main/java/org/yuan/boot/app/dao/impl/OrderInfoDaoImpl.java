package org.yuan.boot.app.dao.impl;

import org.springframework.stereotype.Repository;
import org.yuan.boot.app.dao.OrderInfoDao;
import org.yuan.boot.app.pojo.OrderInfo;
import org.yuan.boot.jdbc.dao.impl.BaseDaoImpl;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-17 12:34
 **/
@Repository
public class OrderInfoDaoImpl extends BaseDaoImpl<OrderInfo> implements OrderInfoDao {
}
