package org.yuan.boot.app.repository;


import org.springframework.stereotype.Repository;
import org.yuan.boot.app.pojo.SysPermission;
import org.yuan.boot.db.jpa.repository.BaseRepository;

@Repository
public interface SysPermissionRepository extends BaseRepository<SysPermission> {
}
