package com.samsharm.awsdemo.controller;

import com.samsharm.awsdemo.model.Employee;
import org.springframework.web.bind.annotation.*;

public interface IEmployeeController {

    public Employee[] getAll() ;
    public String add(@RequestBody Employee employee) ;
    public String update(@RequestBody Employee employee) ;
    public Employee get(@RequestParam (value="id") int id) ;
    public Employee getID(@PathVariable int id) ;
    public String delete(@PathVariable int id) ;
}
