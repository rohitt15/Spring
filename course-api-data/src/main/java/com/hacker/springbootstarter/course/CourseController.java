package com.hacker.springbootstarter.course;


//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hacker.springbootstarter.topic.Topic;

@RestController
public class CourseController {
/*here we are creating a class which is going to return the list of topic from 1 pojo class object
 * 
 */
	@Autowired //it is enables object dependency injection, it is internally uses setter or constructor,it support only object reference
	private CourseService courseService;
	@RequestMapping("/topic/{id}/courses")
	public List<Course> getAllTopic(@PathVariable String id) {
		//return "All topic";
		//here we are returning list thats why we are using Arrays.asList method
		//Spring MVC by default convert the object data in the format of JSON in the API output
		return courseService.getAllCourse(id); 
	}
	
	//here we are adding the request mapping by using id as token
	/*@RequestMapping("/topic/{topicId}/courses/{id}")
	public Optional<Course> getCousre(@PathVariable String id) {
		//when we pass the @PathVariable then it pass the token id in the method as parameter
		//PathVariable mean here topic is path and token (id) is variable in that path
		return courseService.getCourse(id);
	}
*/
	//post method is used to insert the data in the class or database using API
	//example supposed any company want to add the data of the new employees from sheet to database then we used the post method
	
	@RequestMapping(method=RequestMethod.POST,value ="/topic/{topicId}/courses")
	//here using method we are defining the type of the method request and value stands for the API name
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.getAddCourse(course);
	}
	
	//to add modify the data we used the put method
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{topicdId}/courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable  String id) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
		
	}
	
	//to add delete  the data we used the delete method
		@RequestMapping(method=RequestMethod.DELETE,value="/topic/{topicdId}/courses/{id}")
		public void deleteCourse(@PathVariable  String id) {
			courseService.deleteCourse(id);
			
		}

}
