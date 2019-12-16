package org.yuan.boot.app.service.impl;


import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.stereotype.Service;
import org.yuan.boot.app.dao.SysUserDao;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.app.repository.SysUseRepository;
import org.yuan.boot.app.service.SysUserService;
import org.yuan.boot.jpa.service.impl.BaseServiceImpl;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUseRepository, SysUserDao> implements SysUserService {
    @Override
    public PagingResult<SysUser> selectList(SysUser sysUser, int page, int size) {
        return baseDao().selectList(sysUser, page, size);
    }
}
