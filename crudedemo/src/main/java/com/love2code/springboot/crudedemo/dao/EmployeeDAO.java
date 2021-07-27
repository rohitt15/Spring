//Step create Dao interface
package com.love2code.springboot.crudedemo.dao;

import java.util.List;

import com.love2code.springboot.crudedemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
	
}
