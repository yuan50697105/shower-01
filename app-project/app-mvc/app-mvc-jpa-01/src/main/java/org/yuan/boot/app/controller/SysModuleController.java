package org.yuan.boot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.service.SysModuleService;

@RestController
@RequestMapping("sys/module")
public class SysModuleController {
    @Autowired
    private SysModuleService sysModuleService;
}
