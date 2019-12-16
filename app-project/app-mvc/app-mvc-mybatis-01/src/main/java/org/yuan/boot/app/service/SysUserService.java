package org.yuan.boot.app.service;


import com.github.pagehelper.PageInfo;
import org.yuan.boot.app.pojo.SysUser;

public interface SysUserService {
    PageInfo<SysUser> selectList(SysUser sysUser, int page, int size);

    SysUser save(SysUser sysUser);
}
