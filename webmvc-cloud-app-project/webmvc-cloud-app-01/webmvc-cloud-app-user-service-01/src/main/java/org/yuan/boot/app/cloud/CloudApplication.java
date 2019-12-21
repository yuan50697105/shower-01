package org.yuan.boot.app.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-19 12:01
 **/
@EnableEurekaClient
@SpringCloudApplication
public class CloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }
}
