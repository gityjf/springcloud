package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 08:51
 **/
@SpringBootApplication
@EnableEurekaClient     //服务注册
@EnableDiscoveryClient  //服务发现
@MapperScan("com.cloud.dao")
public class ProviderApplication3 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication3.class,args);
    }
}
