package com.dailycodebuffer.Employee.services;

import java.util.List;

import com.dailycodebuffer.Employee.model.Employee;

public interface EmployeeService {

  public Employee createEmployee(Employee employee);

  public List<Employee> getAllEmployees();

}
