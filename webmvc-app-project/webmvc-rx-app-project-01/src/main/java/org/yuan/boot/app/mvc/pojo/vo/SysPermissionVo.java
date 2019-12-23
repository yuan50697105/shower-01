package org.yuan.boot.app.mvc.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SysPermissionVo {
    private Long id;
    @NotEmpty
    private String name;
}
