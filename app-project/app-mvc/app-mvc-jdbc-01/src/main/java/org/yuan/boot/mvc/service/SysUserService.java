package org.yuan.boot.mvc.service;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.mvc.pojo.vo.SysUserVO;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:11
 **/
public interface SysUserService extends BaseService<SysUser> {
    PagingResult<SysUser> selectPageList(SysUserCondition condition);

    List<SysUser> selectList(SysUserCondition condition);

    Optional<SysUser> selectOne(SysUser sysUser);

    void saveFromVo(SysUserVO sysUserVO);

    void updateFromVo(SysUserVO sysUserVO);
}
