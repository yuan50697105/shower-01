package org.yuan.boot.app.repository;

import org.springframework.stereotype.Repository;
import org.yuan.boot.app.pojo.GoodsInfo;
import org.yuan.boot.db.jdbc.repository.BaseRepository;

@Repository
public interface GoodsInfoRepository extends BaseRepository<GoodsInfo> {
}
