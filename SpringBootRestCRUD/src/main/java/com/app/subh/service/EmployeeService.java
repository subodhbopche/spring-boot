package com.app.subh.service;

import com.app.subh.entity.Emp;

import java.util.List;

public interface EmployeeService {


    public List<Emp> getAllEmp();
    public int saveEmp(Emp emp);
    public void deleteEmp(int empID);
    public Emp getEmpByID(int empID);
}
