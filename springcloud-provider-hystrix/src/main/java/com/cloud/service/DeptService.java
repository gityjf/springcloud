package com.cloud.service;

import com.cloud.po.Dept;

import java.util.List;

/**
 * Created by Administrator on 2019/8/16.
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
