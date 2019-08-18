package com.cloud;

import com.myribbon.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 14:19
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name ="provider-server",configuration = MySelfRule.class)
public class CustomerNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerNewApplication.class,args);
    }
}
