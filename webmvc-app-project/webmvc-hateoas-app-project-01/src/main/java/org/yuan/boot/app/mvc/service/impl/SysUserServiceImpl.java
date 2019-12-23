package org.yuan.boot.app.mvc.service.impl;

import cn.hutool.core.lang.Snowflake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.mvc.mapper.SysUserMapper;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.app.mvc.pojo.condition.SysUserCondition;
import org.yuan.boot.app.mvc.pojo.converter.SysUserConverter;
import org.yuan.boot.app.mvc.pojo.vo.SysUserVo;
import org.yuan.boot.app.mvc.service.SysUserService;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private SysUserConverter sysUserConverter;
    @Autowired
    private Snowflake snowflake;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(SysUser sysUser) {
        return sysUserMapper.insertSelective(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveWithNull(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateWithNull(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKey(sysUser);
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
    public Optional<SysUser> selectById(Long id) {
        return Optional.ofNullable(sysUserMapper.selectByPrimaryKey(id));
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
    public void delete(Long id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long[] ids) {
        Arrays.stream(ids).forEach(sysUserMapper::deleteByPrimaryKey);
    }
}
