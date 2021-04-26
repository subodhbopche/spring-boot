package com.app.subh.service;

import com.app.subh.dao.EmployeeDAO;
import com.app.subh.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpServiceImpl implements EmployeeService {

    @Autowired()
    @Qualifier("jpa")
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Emp> getAllEmp() {
        return  employeeDAO.getAllEmp();
    }

    @Override
    @Transactional
    public int saveEmp(Emp emp) {
        return employeeDAO.saveEmp( emp );
    }

    @Override
    @Transactional
    public void deleteEmp(int empID) {
        employeeDAO.deleteEmp( empID );
    }

    @Override
    @Transactional
    public Emp getEmpByID(int empID) {
        return employeeDAO.getEmpByID( empID );
    }
}
