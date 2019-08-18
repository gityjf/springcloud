package com.cloud.service;

import com.cloud.po.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(value = "PROVIDER-SERVER",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService  {

    @RequestMapping(value = "/provider/add", method = RequestMethod.POST)
    public boolean add(Dept dept);

    @RequestMapping(value = "/provider/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/provider/list", method = RequestMethod.GET)
    public List<Dept> list() ;
}
