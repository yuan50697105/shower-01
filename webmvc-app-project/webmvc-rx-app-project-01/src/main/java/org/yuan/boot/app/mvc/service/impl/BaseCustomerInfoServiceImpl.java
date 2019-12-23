package org.yuan.boot.app.mvc.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.boot.app.mvc.mapper.BaseCustomerInfoMapper;
import org.yuan.boot.app.mvc.pojo.BaseCustomerInfo;
import org.yuan.boot.app.mvc.service.BaseCustomerInfoService;
import org.yuan.boot.db.service.impl.BaseServiceImpl;

@Service
public class BaseCustomerInfoServiceImpl extends BaseServiceImpl<BaseCustomerInfo, BaseCustomerInfoMapper> implements BaseCustomerInfoService {
}
