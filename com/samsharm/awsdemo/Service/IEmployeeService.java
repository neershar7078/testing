package com.samsharm.awsdemo.Service;

import com.samsharm.awsdemo.model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int empID);
    boolean addEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void deleteEmployee(int empID);
}
