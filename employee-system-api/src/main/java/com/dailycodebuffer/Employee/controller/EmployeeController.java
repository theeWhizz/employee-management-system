package com.dailycodebuffer.Employee.controller;

import com.dailycodebuffer.Employee.model.Employee;
import com.dailycodebuffer.Employee.services.EmployeeService;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

  private final EmployeeService EmployeeService;

    public EmployeeController(EmployeeService EmployeeService) {
        this.EmployeeService = EmployeeService;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
      return EmployeeService.createEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
      return EmployeeService.getAllEmployees();
    }
}
