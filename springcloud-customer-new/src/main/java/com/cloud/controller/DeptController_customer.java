package com.cloud.controller;

import com.cloud.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 14:20
 **/
@RestController
public class DeptController_customer {
//    private static final String PROVIDER_ADDRESS = "http://localhost:9001";
    private static final String PROVIDER_ADDRESS = "http://provider-server";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/customer/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(PROVIDER_ADDRESS +"/provider/get/"+id,Dept.class);
    }

    @GetMapping(value = "/customer/list")
    public List<Dept> list(){
        return restTemplate.getForObject(PROVIDER_ADDRESS +"/provider/list",List.class);
    }

    @PostMapping("/customer/add")
    public Boolean add(Dept dept){
        return restTemplate.postForObject(PROVIDER_ADDRESS +"/provider/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/customer/discovery", method = RequestMethod.GET)
    public Object discovery() {
        return restTemplate.getForObject(PROVIDER_ADDRESS+"/provider/discovery",Object.class);
    }
}
