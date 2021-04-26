package com.app.subh.restcontroller;

import com.app.subh.entity.Emp;
import com.app.subh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpRestController {

    @Autowired
    EmployeeService employeeService;

    @Value( "${code.author}" )
    private String authorName;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Emp> getEmployee(){
       return employeeService.getAllEmp();
    }

    @RequestMapping(value = "/employee/{empID}", method = RequestMethod.GET)
    public Emp getEmployeeByID(@PathVariable int empID){
        return employeeService.getEmpByID( empID );
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public int saveEmp(@RequestBody Emp emp){
        return employeeService.saveEmp( emp );
    }

    @RequestMapping(value = "/employee/{empID}", method = RequestMethod.DELETE)
    public void deleteEmp(@PathVariable int eid){
        employeeService.deleteEmp( eid );
    }


    @RequestMapping(value = "/getCodeAuthor", method = RequestMethod.GET)
    public String getCodeAuthor(){
       return authorName;
    }



}
