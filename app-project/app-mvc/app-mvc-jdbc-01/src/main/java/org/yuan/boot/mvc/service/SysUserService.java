package org.yuan.boot.mvc.service;

import org.yuan.boot.db.jdbc.service.BaseService;
import org.yuan.boot.mvc.pojo.Result;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.mvc.pojo.vo.SysUserVO;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:11
 **/
public interface SysUserService extends BaseService<SysUser> {
    Result selectPageList(SysUserCondition condition);

    Result selectList(SysUserCondition condition);

    Result selectOne(SysUser sysUser);

    Result saveFromVo(SysUserVO sysUserVO);

    Result updateFromVo(SysUserVO sysUserVO);
}
