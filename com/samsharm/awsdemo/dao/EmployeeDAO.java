package com.samsharm.awsdemo.dao;

import com.samsharm.awsdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDAO {

    private Map<Integer, Employee> employeeMap = new HashMap();

    public EmployeeDAO()
    {
        employeeMap.put(1, new Employee(1, "Smith", 1000));
        employeeMap.put(2, new Employee(2, "Neeraj", 2000));
        employeeMap.put(3, new Employee(3, "Mophit", 3000));
    }

    public Employee getByID(int id) {
        return employeeMap.get(id);
    }

    public void remove(int id) {
        employeeMap.remove(id);
    }

    public void add(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public void update(Employee employee) {
        if (employeeMap.get(employee.getId()) != null) {
            employeeMap.put(employee.getId(), employee);
        }
    }

    public Employee[] getAll() {
        return employeeMap.values().toArray(new Employee[0]);
    }

}
