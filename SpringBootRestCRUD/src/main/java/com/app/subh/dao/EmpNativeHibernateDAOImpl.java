package com.app.subh.dao;

import com.app.subh.entity.Emp;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import java.util.List;

@Repository("nativeHibernate")
public class EmpNativeHibernateDAOImpl implements EmployeeDAO {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Emp> getAllEmp() {
        System.out.println("EmpNativeHibernateDAOImpl getALLEmp");
        Session session = entityManager.unwrap( Session.class );

        Query<Emp> theResult = session.createQuery( "from Emp", Emp.class );
        return theResult.getResultList();

    }

    @Override
    public int saveEmp(Emp emp) {
        Session session = entityManager.unwrap( Session.class );
        session.save( emp );
        return emp.getEid();
    }

    @Override
    public void deleteEmp(int empID) {
        Session session = entityManager.unwrap( Session.class );
        Emp emp = session.get( Emp.class, empID );
        session.delete( emp );
    }

    @Override
    public Emp getEmpByID(int empID) {
        Session session = entityManager.unwrap( Session.class );
        Emp emp = session.get( Emp.class, empID );
        return emp;
    }
}
