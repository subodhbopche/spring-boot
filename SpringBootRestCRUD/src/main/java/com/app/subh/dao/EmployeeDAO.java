package com.app.subh.dao;


import com.app.subh.entity.Emp;

import java.util.List;

public interface  EmployeeDAO {

    public List<Emp> getAllEmp();
    public int saveEmp(Emp emp);
    public void deleteEmp(int empID);
    public Emp getEmpByID(int empID);

}
