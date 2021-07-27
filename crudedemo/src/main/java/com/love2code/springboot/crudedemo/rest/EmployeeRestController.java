package com.love2code.springboot.crudedemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.love2code.springboot.crudedemo.dao.EmployeeDAO;
import com.love2code.springboot.crudedemo.entity.Employee;
import com.love2code.springboot.crudedemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

//here we jnjecting the service class from there we are calling the Dao
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService) {
		employeeService=theEmployeeService;
		
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
		
	}
	
	@GetMapping("/employees/{Id}")
	public Employee getEmployeeById(@PathVariable int Id) {
		Employee employee=employeeService.findById(Id);
		
		if(employee==null) {
			throw new RuntimeException("No Employee record find for -"+Id);
		}
		return employee;
	}

	//post method to insert the data
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		//also just in case they pass an id in json ..set id to 0
		/*if(theEmployee.getId()==0)
		   {
			theEmployee.setId(0);
		   }*/
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	//put method to update the data
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	//delete method to delete the employee record for particular employee id
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee empId=employeeService.findById(employeeId);
		if(empId==null) {
			return "no record employee id - "+employeeId;
		}
		employeeService.deleteById(employeeId);
		return "deleted employee id - "+employeeId;
				
	}
}
