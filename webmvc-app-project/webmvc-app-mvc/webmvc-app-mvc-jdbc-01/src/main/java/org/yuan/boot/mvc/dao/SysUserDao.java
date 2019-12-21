package org.yuan.boot.mvc.dao;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.jdbc.dao.BaseDao;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:09
 **/
public interface SysUserDao extends BaseDao<SysUser> {
    PagingResult<SysUser> selectList(SysUserCondition condition, int page, int size);

    List<SysUser> selectList(SysUserCondition condition);

    Optional<SysUser> selectOne(SysUser sysUser);
}
