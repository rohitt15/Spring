package com.hacker.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
 
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourse(String topicId){
		List<Course> courseics=new ArrayList<>();
		courseRepository.findByTopicId(topicId).
		forEach(courseics::add);
				 return courseics;
	}
	
	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);

	}
	public void getAddCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
