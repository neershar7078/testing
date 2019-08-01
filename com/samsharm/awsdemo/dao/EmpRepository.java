package com.samsharm.awsdemo.dao;

import com.samsharm.awsdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer>{
}
