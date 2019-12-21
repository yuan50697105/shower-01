package org.yuan.boot.mvc.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SysModuleVo {
    private Long id;
    @NotEmpty(message = "模块名称不能为空")
    private String name;
    @NotEmpty(message = "内容不能为空")
    private String content;
    @NotEmpty(message = "链接不能为空")
    private String url;

}
