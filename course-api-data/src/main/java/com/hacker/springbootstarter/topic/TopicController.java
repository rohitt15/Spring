package com.hacker.springbootstarter.topic;


//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		//Spring MVC by default convert the object data in the format of JSON in the API output
		return topService.getAllTopice(); 
	}
	
	//here we are adding the request mapping by using id as token
	@RequestMapping("/topic/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		//when we pass the @PathVariable then it pass the token id in the method as parameter
		//PathVariable mean here topic is path and token (id) is variable in that path
		return topService.getTopic(id);
	}

	//post method is used to insert the data in the class or database using API
	//example supposed any company want to add the data of the new employees from sheet to database then we used the post method
	
	@RequestMapping(method=RequestMethod.POST,value ="topic")
	//here using method we are defining the type of the method request and value stands for the API name
	public void addTopic(@RequestBody Topic topic) {
		//if doesn't add the RequestBody annotation then data in the topic data will comes as null,so insert will happening
		//here we are passing the Topic class object as reference where we want to insert the data
		topService.getAddTopic(topic);
	}
	
	//to add modify the data we used the put method
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable  String id) {
		topService.updateTopice(id,topic);
		
	}
	
	//to add delete  the data we used the delete method
		@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
		public void deleteTopic(@PathVariable  String id) {
			topService.deleteTopice(id);
			
		}

}
