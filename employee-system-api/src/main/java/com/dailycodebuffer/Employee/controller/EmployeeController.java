package com.dailycodebuffer.Employee.controller;

import com.dailycodebuffer.Employee.services.EmployeeService;

import com.dailycodebuffer.Employee.model.Employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
