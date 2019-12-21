package org.yuan.boot.mvc.repository;

import org.springframework.stereotype.Repository;
import org.yuan.boot.db.jdbc.repository.BaseRepository;
import org.yuan.boot.mvc.pojo.SysUser;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:09
 **/
@Repository
public interface SysUserRepository extends BaseRepository<SysUser> {
}
