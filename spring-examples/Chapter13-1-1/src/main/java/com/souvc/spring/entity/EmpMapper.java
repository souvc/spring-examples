package com.souvc.spring.entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * EmpMapper映射类
 */
public class EmpMapper implements RowMapper<Emp>{
    public Emp mapRow(ResultSet rs, int rowIndex) throws SQLException {
        Emp emp = new Emp();
        emp.setEmpno(rs.getInt("EMPNO"));
        emp.setEname(rs.getString("ENAME"));
        emp.setJob(rs.getString("JOB"));
        emp.setMgr(rs.getInt("MGR"));
        emp.setHiredate(rs.getDate("HIREDATE"));
        emp.setSal(rs.getDouble("SAL"));
        emp.setComm(rs.getDouble("COMM"));
        emp.setDeptno(rs.getInt("DEPTNO"));
        return emp;
    }
}