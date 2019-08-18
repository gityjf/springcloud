package com.cloud.controller;

import com.cloud.po.Dept;
import com.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 14:20
 **/
@RestController
public class DeptController_customer {


    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/customer/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @GetMapping(value = "/customer/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

    @PostMapping("/customer/add")
    public Boolean add(Dept dept) {
        return deptClientService.add(dept);
    }


}
