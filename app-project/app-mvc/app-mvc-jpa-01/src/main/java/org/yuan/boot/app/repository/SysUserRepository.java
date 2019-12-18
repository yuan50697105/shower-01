package org.yuan.boot.app.repository;


import org.springframework.stereotype.Repository;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.jpa.repository.BaseRepository;

@Repository
public interface SysUserRepository extends BaseRepository<SysUser> {
}
