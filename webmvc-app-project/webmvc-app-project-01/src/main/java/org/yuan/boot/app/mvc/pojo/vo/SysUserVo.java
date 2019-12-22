package org.yuan.boot.app.mvc.pojo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

@Data
@Accessors(chain = true)
public class SysUserVo {
    private Long id;
    @NotEmpty(message = "账户不能为空")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
    @NotEmpty(message = "姓名不能为空")
    private String realName;
    @NotEmpty(message = "昵称不能为空")
    private String nickName;

}
