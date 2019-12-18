package org.yuan.boot.app.service.impl;


import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.GoodsInfoMapper;
import org.yuan.boot.app.pojo.GoodsInfo;
import org.yuan.boot.app.repository.GoodsInfoRepository;
import org.yuan.boot.app.service.GoodsInfoService;
import org.yuan.boot.jpa.service.impl.BaseServiceImpl;

@Service
public class GoodsInfoServiceImpl extends BaseServiceImpl<GoodsInfo, GoodsInfoRepository, GoodsInfoMapper> implements GoodsInfoService {
}
