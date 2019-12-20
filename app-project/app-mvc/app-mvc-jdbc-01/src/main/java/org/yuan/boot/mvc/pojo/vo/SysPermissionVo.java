package org.yuan.boot.mvc.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SysPermissionVo {
    private Long id;
    @NotEmpty(message = "权限名称不能为空")
    private String name;
}
