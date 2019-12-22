package org.yuan.boot.app.mvc.service;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.app.mvc.pojo.SysUser;
import org.yuan.boot.app.mvc.pojo.dto.SysUserCondition;
import org.yuan.boot.app.mvc.pojo.vo.SysUserVo;
import org.yuan.boot.db.service.BaseService;

import java.util.List;
import java.util.Optional;

public interface SysUserService extends BaseService<SysUser> {

    void saveWithNull(SysUser sysUser);

    PageInfo<SysUser> selectPage(SysUserCondition condition);

    List<SysUser> selectList(SysUserCondition condition);

    Optional<SysUser> selectOne(SysUser sysUser);

    void saveFormVo(SysUserVo sysUserVo);

    void updateFromVo(SysUserVo sysUserVo);

    void delete(Long[] ids);
}
