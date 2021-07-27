package com.love2code.springboot.crudedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.love2code.springboot.crudedemo.dao.EmployeeDAO;
import com.love2code.springboot.crudedemo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	EmployeeDAO employeeDao;

	@Autowired
	EmployeeServiceImp(EmployeeDAO theEmlpyeeDao) {
		//delegate the call to DAO
		employeeDao = theEmlpyeeDao;

	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDao.deleteById(id);
	}

}
