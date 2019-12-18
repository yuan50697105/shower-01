package org.yuan.boot.app.repository;


import org.springframework.stereotype.Repository;
import org.yuan.boot.app.pojo.OrderInfo;
import org.yuan.boot.jpa.repository.BaseRepository;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-17 12:32
 **/
@Repository
public interface OrderInfoRepository extends BaseRepository<OrderInfo> {
}
