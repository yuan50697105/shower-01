package org.yuan.boot.app.mvc.service.impl;

import cn.hutool.core.lang.Snowflake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.mvc.mapper.SysUserMapper;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.app.mvc.pojo.converter.SysUserConverter;
import org.yuan.boot.app.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.app.mvc.pojo.vo.SysUserVo;
import org.yuan.boot.app.mvc.repository.SysUserRepository;
import org.yuan.boot.app.mvc.service.SysUserService;
import org.yuan.boot.db.service.impl.BaseServiceImpl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserMapper> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private SysUserConverter sysUserConverter;
    @Autowired
    private Snowflake snowflake;


    @Override
    public void saveWithNull(SysUser sysUser) {
        baseMapper().insert(sysUser);
    }

    @Override
    public PageInfo<SysUser> selectPage(SysUserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageInfo.of(sysUserMapper.selectListByCondition(condition));
    }

    @Override
    public List<SysUser> selectList(SysUserCondition condition) {
        return sysUserMapper.selectListByCondition(condition);
    }

    @Override
    public Optional<SysUser> selectOne(SysUser sysUser) {
        return Optional.ofNullable(sysUserMapper.selectOne(sysUser));
    }


    @Override
    public void saveFormVo(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setCreateTime(new Date());
        sysUser.setId(snowflake.nextId());
        save(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateFromVo(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setUpdateTime(new Date());
        update(sysUser);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long[] ids) {
        Arrays.stream(ids).forEach(sysUserMapper::deleteByPrimaryKey);
    }
}
