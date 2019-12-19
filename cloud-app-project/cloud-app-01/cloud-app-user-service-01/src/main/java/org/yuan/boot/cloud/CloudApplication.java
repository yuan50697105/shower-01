package org.yuan.boot.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-19 12:01
 **/
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class CloudApplication {
}
