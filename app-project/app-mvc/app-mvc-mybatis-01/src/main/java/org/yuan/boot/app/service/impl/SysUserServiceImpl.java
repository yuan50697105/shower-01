package org.yuan.boot.app.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuan.boot.app.mapper.SysUserMapper;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.app.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public PageInfo<SysUser> selectList(SysUser sysUser, int page, int size) {
        PageHelper.startPage(page, size);
        return PageInfo.of(sysUserMapper.selectList(sysUser));
    }

    @Override
    public SysUser save(SysUser sysUser) {
        sysUserMapper.insertSelective(sysUser);
        return sysUser;
    }
}
