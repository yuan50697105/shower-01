package org.yuan.boot.app.mvc.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.app.mvc.pojo.BaseCustomerInfo;
import org.yuan.boot.app.mvc.pojo.vo.BaseCustomerInfoVo;

@Mapper(componentModel = "spring")
public interface BaseCustomerInfoConverter {
    BaseCustomerInfo convert(BaseCustomerInfoVo baseCustomerInfoVo);
}
