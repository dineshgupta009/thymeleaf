package com.thymeleaf.Service;

import com.thymeleaf.Model.Employee;
import com.thymeleaf.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllEmployee() {

        List<Employee> employee = employeeRepository.findAll();
        return employee;
    }

    @Override
    public void createNewEmployee(Employee employee) {

        this.employeeRepository.save(employee);

    }
}
