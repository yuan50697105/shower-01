package org.yuan.boot.webmvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.db.DbCoreApplication;
import org.yuan.boot.db.DbMybatisBaseApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2020-01-03 21:27
 */
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbCoreApplication.class, DbMybatisBaseApplication.class})
public class WebMvcApp01 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApp01.class, args);
    }
}