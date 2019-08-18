package com.cloud.controller;

import com.cloud.po.Dept;
import com.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 10:39
 **/
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/provider/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/provider/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if (dept == null) {
            throw new RuntimeException("空指针");
        }
        return dept;
    }

    @RequestMapping(value = "/provider/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping(value = "/provider/discovery", method = RequestMethod.GET)
    public Object discovery() {
        return this.discoveryClient;
    }
}
