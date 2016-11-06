package com.souvc.spring.dao;

import com.souvc.spring.entity.Emp;
import com.souvc.spring.entity.EmpMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class JdbcEmpDAO2 implements EmpDAO{

    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template){
        this.template = template;
    }
    
    public void delete(int no) {
        String sql = "delete from t_emp where empno=?";
        Object[] params = {no};
        template.update(sql,params);
    }
    public List<Emp> findAll() {
        String sql = "select * from t_emp";
        RowMapper<Emp> mapper = new EmpMapper();
        List<Emp> list = template.query(sql, mapper);
        return list;
    }
    public Emp findByNo(int no) {
        String sql = "select * from t_emp where EMPNO=?";
        Object[] params = {no};
        RowMapper<Emp> mapper = new EmpMapper();
        Emp emp = template.queryForObject(sql, params,mapper);
        return emp;
    }
    public void save(Emp emp) {
        String sql = "insert into t_emp (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) " +
                "values (?,?,?,?,?,?,?,?)";
        Object[] params = {
            emp.getEmpno(),
            emp.getEname(),
            emp.getJob(),
            emp.getMgr(),
            emp.getHiredate(),
            emp.getSal(),
            emp.getComm(),
            emp.getDeptno()
        };
        template.update(sql,params);
    }
    public void update(Emp emp) {
        String sql = "update t_emp " +
                "set ENAME=?,JOB=?,MGR=?," +
                "HIREDATE=?,SAL=?,COMM=?,DEPTNO=? " +
                "where EMPNO=?";
        Object[] params = {
                emp.getEname(),
                emp.getJob(),
                emp.getMgr(),
                emp.getHiredate(),
                emp.getSal(),
                emp.getComm(),
                emp.getDeptno(),
                emp.getEmpno()
        };
        template.update(sql,params);
    }
}