package com.thymeleaf.Service;

import com.thymeleaf.Model.Employee;

import java.util.List;

public interface  EmployeeService  {

    List<Employee> findAllEmployee();
    void createNewEmployee(Employee employee);

}
