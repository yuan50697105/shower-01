package org.yuan.boot.app.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.GoodsInfoMapper;
import org.yuan.boot.app.pojo.GoodsInfo;
import org.yuan.boot.app.service.GoodsInfoService;
import org.yuan.boot.db.mybatis.service.impl.BaseServiceImpl;

@Service
public class GoodsInfoServiceImpl extends BaseServiceImpl<GoodsInfo, GoodsInfoMapper> implements GoodsInfoService {
}
