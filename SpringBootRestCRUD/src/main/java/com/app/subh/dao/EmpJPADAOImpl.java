package com.app.subh.dao;

import com.app.subh.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository("jpa")
public class EmpJPADAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmpJPADAOImpl(EntityManager entityManager){
        System.out.println("EmpJPADAOImpl");
        this.entityManager = entityManager;
    }

    @Override
    public List<Emp> getAllEmp() {
        System.out.println("EmpJPADAOImpl getALLEmp");
        return entityManager.createQuery( "from Emp", Emp.class ).getResultList();
    }

    @Override
    public int saveEmp(Emp emp) {
        entityManager.persist( emp );
        return emp.getEid();
    }

    @Override
    public void deleteEmp(int empID) {
        entityManager.remove( entityManager.find( Emp.class, empID ) );
    }

    @Override
    public Emp getEmpByID(int empID) {
        return entityManager.find( Emp.class, empID );
    }
}
