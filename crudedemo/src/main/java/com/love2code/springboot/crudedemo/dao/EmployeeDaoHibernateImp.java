package com.love2code.springboot.crudedemo.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.love2code.springboot.crudedemo.entity.Employee;

@Repository
public class EmployeeDaoHibernateImp implements EmployeeDAO {

	// define the Entity Manager

	private EntityManager entityManager;

	// set up construction injection
	@Autowired

	public EmployeeDaoHibernateImp(EntityManager theentityManager) {
		entityManager = theentityManager;
	}

	@Override
	//@Transactional  it hanle the all transaction so need to start and commit the transaction
	public List<Employee> findAll() {
		// get the hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create the query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
								   //currentSession.createQuery("from Employee", Employee.class);

		// excute the query
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int id ) {
		//get the hibernate
		Session currentSession = entityManager.unwrap(Session.class);
//get the employee
		Employee theemployee =currentSession.get(Employee.class,id);
		return theemployee;
	}

	@Override
	public void save(Employee employee) {
		Session currentSession=entityManager.unwrap(Session.class);
		
		//save employee
		currentSession.saveOrUpdate(employee);
	}

	@Override
	public void deleteById(int id) {
		//get the hibernate
				Session currentSession = entityManager.unwrap(Session.class);
		//get the employee
				  Query query=
						currentSession.createQuery(" delete from Employee where id=:employeeId" );
				  query.setParameter("employeeId",id);
				  query.executeUpdate();
				  
	}
	
	

}
