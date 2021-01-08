package com.tommy.why.dao;

import com.tommy.why.pojo.Department;
import com.tommy.why.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;

    static {

        employees = new HashMap<Integer, Employee>();
        employees.put(1001,new Employee(1001,"aa","xxoo@qq.com",1,new Department(101,"java")));
        employees.put(1002,new Employee(1002,"bb","xxoo@qq.com",0,new Department(102,"php")));
        employees.put(1003,new Employee(1003,"cc","xxoo@qq.com",1,new Department(103,"python")));

    }

    private static Integer initId= 1004;
    public void addEmployee(Employee employee){
        if(employee.getId() == null){
            employee.setId( initId++ );
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return  employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }

}
