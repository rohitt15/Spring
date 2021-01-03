package com.hacker.springbootstarter.topic;


//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
/*here we are creating a class which is going to return the list of topic from 1 pojo class object
 * 
 */
	@Autowired //it is enables object dependency injection, it is internally uses setter or constructor,it support only object reference
	private TopicService topService;
	@RequestMapping("/topic")
	public List<Topic> getAllTopic() {
		//return "All topic";
		//here we are returning list thats why we are using Arrays.asList method
		//spring mvc by default convert the object data in the format of json in the api output
		return topService.getAllTopice(); 
	}
	
}
