package com.samsharm.awsdemo.Service;

import com.samsharm.awsdemo.dao.EmpRepository;
import com.samsharm.awsdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmpRepository empRepository;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        empRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Employee getEmployeeById(int empID) {
        Employee obj = empRepository.findById(empID).get();
        return obj;
    }

    @Override
    public boolean addEmployee(Employee emp) {
        Optional<Employee> empValue = empRepository.findById(emp.getId());
        if(empValue.isPresent())
            return false;
        empRepository.save(emp);
        return true;
    }

    @Override
    public void updateEmployee(Employee emp) {
        empRepository.save(emp);

    }

    @Override
    public void deleteEmployee(int empID) {

        empRepository.delete(getEmployeeById(empID));
    }
}
