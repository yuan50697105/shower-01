package org.yuan.boot.app.mvc.repository;

import org.springframework.stereotype.Repository;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.db.repository.BaseRepository;

@Repository
public interface SysUserRepository extends BaseRepository<SysUser> {
}
