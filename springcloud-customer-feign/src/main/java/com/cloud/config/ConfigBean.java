package com.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 14:32
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced   //开启ribbom 客户端 负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
