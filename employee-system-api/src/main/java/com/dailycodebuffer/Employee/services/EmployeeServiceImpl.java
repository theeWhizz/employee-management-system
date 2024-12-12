package com.dailycodebuffer.Employee.services;

import org.springframework.beans.BeanUtils;

import com.dailycodebuffer.Employee.model.Employee;
import com.dailycodebuffer.Employee.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

import com.dailycodebuffer.Employee.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

  @Override
  public Employee createEmployee(Employee employee) {
    EmployeeEntity employeeEntity = new EmployeeEntity();

    BeanUtils.copyProperties(employee, employeeEntity);
    employeeRepository.save(employeeEntity);
    return employee;
  }
}
