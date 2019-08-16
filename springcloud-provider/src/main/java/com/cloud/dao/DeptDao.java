package com.cloud.dao;

import com.cloud.po.Dept;

import java.util.List;

/**
 * Created by Administrator on 2019/8/16.
 */
public interface DeptDao {
    public Boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
