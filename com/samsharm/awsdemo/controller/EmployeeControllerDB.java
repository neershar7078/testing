package com.samsharm.awsdemo.controller;

import com.samsharm.awsdemo.Service.IEmployeeService;
import com.samsharm.awsdemo.dao.EmployeeDAO;
import com.samsharm.awsdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("MySqlDB")
public class EmployeeControllerDB implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("employee/all")
    @ResponseBody
    public Employee[] getAll() {
        List<Employee> list = employeeService.getAllEmployees();
        Employee[] arr = new Employee[list.size()];

        for (int i =0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;
    }

    @PostMapping("employee/")
    @ResponseBody
    public String add(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "success";
    }

    @PutMapping("employee/")
    @ResponseBody
    public String update(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "success";
    }

    @GetMapping("employees/")
    @ResponseBody
    public Employee get(@RequestParam (value="id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("employee/{id}")
    @ResponseBody
    public Employee getID(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("employee/{id}")
    @ResponseBody
    public String delete(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "success";
    }
}
