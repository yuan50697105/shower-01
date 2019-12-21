package org.yuan.boot.mvc.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SysUserVO {
    private Long id;
    @NotEmpty(message = "账户不能为空")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
}
