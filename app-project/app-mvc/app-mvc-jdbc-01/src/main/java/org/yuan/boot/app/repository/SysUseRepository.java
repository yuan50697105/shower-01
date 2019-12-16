package org.yuan.boot.app.repository;

import org.springframework.stereotype.Repository;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.jdbc.repository.BaseRepository;

/**
 * @author yuane
 */
@Repository
public interface SysUseRepository extends BaseRepository<SysUser> {
}
