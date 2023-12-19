package com.thymeleaf.Controller;

import com.thymeleaf.Model.Employee;
import com.thymeleaf.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private  EmployeeService employeeService;

    @GetMapping("/home")
    public String homePage(){
        System.out.println("this is running ");
        return "home";
    }

    @GetMapping("/")
    public String getAllEmployees(Model model){

        List<Employee> employees = employeeService.findAllEmployee();
        model.addAttribute("employeesList",employees);
        return "index";
    }

    @GetMapping("/addEmployeeForm")
    public String addEmployeeForm(Model model) {
        Employee employee = new Employee();
     model.addAttribute("employee", employee);
        return "new_employee";
    }
    @PostMapping("/saveEmployee")
    public String createNewEmployee(@ModelAttribute ("employee") Employee employee){
        employeeService.createNewEmployee(employee);
        return "redirect:/";
    }
}
