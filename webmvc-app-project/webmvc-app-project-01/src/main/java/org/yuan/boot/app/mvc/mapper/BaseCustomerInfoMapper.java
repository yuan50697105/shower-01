package org.yuan.boot.app.mvc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.app.mvc.pojo.BaseCustomerInfo;
import org.yuan.boot.app.mvc.pojo.example.BaseCustomerInfoExample;
import org.yuan.boot.db.mapper.BaseMapper;

@Mapper
public interface BaseCustomerInfoMapper extends BaseMapper<BaseCustomerInfo> {
    long countByExample(BaseCustomerInfoExample example);

    int deleteByExample(BaseCustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseCustomerInfo record);

    int insertSelective(BaseCustomerInfo record);

    List<BaseCustomerInfo> selectByExample(BaseCustomerInfoExample example);

    BaseCustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseCustomerInfo record, @Param("example") BaseCustomerInfoExample example);

    int updateByExample(@Param("record") BaseCustomerInfo record, @Param("example") BaseCustomerInfoExample example);

    int updateByPrimaryKeySelective(BaseCustomerInfo record);

    int updateByPrimaryKey(BaseCustomerInfo record);
}