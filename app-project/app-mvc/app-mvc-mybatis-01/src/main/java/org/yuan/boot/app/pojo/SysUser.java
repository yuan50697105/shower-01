package org.yuan.boot.app.pojo;


import lombok.Data;

@Data
public class SysUser {
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String nickName;
    
}
