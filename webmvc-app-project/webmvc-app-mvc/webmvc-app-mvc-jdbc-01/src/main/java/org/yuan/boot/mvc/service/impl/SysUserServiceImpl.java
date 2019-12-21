package org.yuan.boot.mvc.service.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jdbc.service.impl.BaseServiceImpl;
import org.yuan.boot.mvc.dao.SysUserDao;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.converter.SysUserConverter;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.mvc.pojo.vo.SysUserVO;
import org.yuan.boot.mvc.repository.SysUserRepository;
import org.yuan.boot.mvc.service.SysUserService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:18
 **/
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserDao> implements SysUserService {
    @Autowired
    private SysUserConverter sysUserConverter;

    @Override
    public PagingResult<SysUser> selectPageList(SysUserCondition condition) {
        return baseDao().selectList(condition, condition.getPage(), condition.getSize());
    }

    @Override
    public List<SysUser> selectList(SysUserCondition condition) {
        return baseDao().selectList(condition);
    }

    @Override
    public Optional<SysUser> selectOne(SysUser sysUser) {
        return baseDao().selectOne(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveFromVo(SysUserVO sysUserVO) {
        SysUser sysUser = sysUserConverter.convert(sysUserVO);
        sysUser.setCreateTime(LocalDateTime.now());
        save(sysUser);
    }

    @Override
    public void updateFromVo(SysUserVO sysUserVO) {
        SysUser sysUser = sysUserConverter.convert(sysUserVO);
        sysUser.setUpdateTime(LocalDateTime.now());
        update(sysUser);
    }
}
