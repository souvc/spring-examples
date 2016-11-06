package com.souvc.spring.dao;

import com.souvc.spring.entity.Emp;

import java.util.List;

public interface EmpDAO {
    /**保存员工*/
    public void save(Emp emp);
    /**更新员工*/
    public void update(Emp emp);
    /**删除员工*/
    public void delete(int no);
    /**根据员工账号查找*/
    public Emp findByNo(int no);
    /**查找全部账号*/
    public List<Emp> findAll();
}