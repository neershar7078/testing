package com.samsharm.awsdemo;

import com.samsharm.awsdemo.dao.EmpRepository;
import com.samsharm.awsdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    EmpRepository sqlRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    /*    Employee emp1 = new Employee();
        emp1.setName("First");
        emp1.setSalary(1000);
        sqlRepository.save(emp1);

        Employee emp2 = new Employee();
        emp2.setName("Second");
        emp2.setSalary(2000);
        sqlRepository.save(emp2);

        Iterable<Employee> empList = sqlRepository.findAll();
        System.out.println("here are system count: " + empList.toString());
        for(Employee emp:empList){
            System.out.println("Here is a system: " + emp.toString());
        }
*/

    }
}
