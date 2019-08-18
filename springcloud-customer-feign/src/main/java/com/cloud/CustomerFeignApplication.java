package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 14:19
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CustomerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFeignApplication.class,args);
    }
}
