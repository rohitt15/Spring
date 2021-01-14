package com.hacker.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/*if we have to do CRUD operation then we have to extend the interface CrudRepositort and no need to implement data layer 
and it is generic type thats why we are passing Topic and String
*/
public interface CourseRepository extends CrudRepository<Course,String>{

/*this will split method name and search with description name in the class with implementing the intereface
 * and with description name it fetch the data from database
 * List<Course> findByDescription(String description);
*/
List<Course> findByTopicId(String id);	
}
