package com.love2code.springboot.crudedemo.service;

import java.util.List;

import com.love2code.springboot.crudedemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int id);

	public void save(Employee employee);

	public void deleteById(int id);

}
