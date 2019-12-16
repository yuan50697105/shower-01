package org.yuan.boot.app.dao.impl;

import org.springframework.stereotype.Repository;
import org.yuan.boot.app.dao.GoodsInfoDao;
import org.yuan.boot.app.pojo.GoodsInfo;
import org.yuan.boot.jdbc.dao.impl.BaseDaoImpl;

@Repository
public class GoodsInfoDaoImpl extends BaseDaoImpl<GoodsInfo> implements GoodsInfoDao {
}
