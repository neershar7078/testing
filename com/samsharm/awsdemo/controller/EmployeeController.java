package com.samsharm.awsdemo.controller;

import com.samsharm.awsdemo.dao.EmployeeDAO;
import com.samsharm.awsdemo.dao.EmpRepository;
import com.samsharm.awsdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("InMemoryDB")
public class EmployeeController implements IEmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("employee/all")
    @ResponseBody
    public Employee[] getAll() {
        return employeeDAO.getAll();
    }

    @PostMapping("employee/")
    @ResponseBody
    public String add(@RequestBody Employee employee) {
        employeeDAO.add(employee);
        return "success";
    }

    @PutMapping("employee/")
    @ResponseBody
    public String update(@RequestBody Employee employee) {
        employeeDAO.add(employee);
        return "success";
    }

    @GetMapping("employees/")
    @ResponseBody
    public Employee get(@RequestParam (value="id") int id) {
        return employeeDAO.getByID(id);
    }

    @GetMapping("employee/{id}")
    @ResponseBody
    public Employee getID(@PathVariable int id) {
        return employeeDAO.getByID(id);
    }

    @DeleteMapping("employee/{id}")
    @ResponseBody
    public String delete(@PathVariable int id) {
        employeeDAO.remove(id);
        return "success";
    }
}
