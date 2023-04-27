package com.myprojects.payslip.controller;

import java.util.List;

import com.myprojects.payslip.entity.Employee;
import com.myprojects.payslip.exception.ResourceNotFoundException;
import com.myprojects.payslip.exception.Response;
import com.myprojects.payslip.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	 private EmployeeService employeeService;
	@GetMapping("")
	public List<Employee> getAllEmployee(){
		return this.employeeService.getAllEmployee();
	}
	
	@PostMapping("")
	public Response createEmployee(@RequestBody Employee emp)
	{
		return this.employeeService.createEmployee(emp);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable int id) throws ResourceNotFoundException {
		try {
			Employee employee = employeeService.getEmployeeById(id);
			return ResponseEntity.ok(employee);
		}catch(Exception e) {
			throw new ResourceNotFoundException("Employee doesn't exist: ");
		}
	}

//	@DeleteMapping("/{id}")
//	public ResponseEntity<?> deletePaySlipById(@PathVariable Long id) throws ResourceNotFoundException{
// 	   return null;
//	}

}
