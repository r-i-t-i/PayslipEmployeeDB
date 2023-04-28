package com.myprojects.payslip.service;

import com.myprojects.payslip.entity.Employee;
import com.myprojects.payslip.exception.Response;
import com.myprojects.payslip.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Response createEmployee(Employee emp){
        Employee employee = this.employeeRepository.save(emp);
        if(employee == null){
            return new Response(500, "Cannot create Employee", System.currentTimeMillis(), false);
        }
        return new Response(200, "Ok", System.currentTimeMillis(), true);
    }

    public List<Employee> getAllEmployee(){
        return this.employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id){
        Employee emp = this.employeeRepository.findById(id).orElse(null);
        return emp;
    }


}
