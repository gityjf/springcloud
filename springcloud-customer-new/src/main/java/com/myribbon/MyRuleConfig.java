package com.myribbon;


import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRuleConfig {

    @Bean
    public IRule getRule() {
        return new MySelfRule();
    }
}
