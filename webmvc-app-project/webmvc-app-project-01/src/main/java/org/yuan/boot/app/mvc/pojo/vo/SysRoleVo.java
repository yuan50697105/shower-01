package org.yuan.boot.app.mvc.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SysRoleVo {
    private Long id;
    @NotEmpty(message = "角色名称不能为空")
    private String name;
}
