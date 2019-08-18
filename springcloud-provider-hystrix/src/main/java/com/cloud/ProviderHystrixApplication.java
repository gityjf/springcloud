package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 08:51
 **/
@SpringBootApplication
@EnableEurekaClient     //服务注册
@EnableDiscoveryClient  //服务发现
//@EnableHystrix
@EnableCircuitBreaker
@MapperScan("com.cloud.dao")
public class ProviderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApplication.class,args);
    }
}
