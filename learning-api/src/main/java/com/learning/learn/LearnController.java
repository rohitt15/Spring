package com.learning.learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnController {

	@Autowired
	LearnService service;
	/*@RequestMapping("/hello")
	public String getHi() {
		return "Hi";
	}
	*/
	@RequestMapping(method = RequestMethod.GET,value="/learnTopic")
	public List<LearnTopic> getTopic() {
		return service.getAllTopic();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/learnTopic/{id}")
	public LearnTopic getTopicById(@PathVariable String id) {
		return service.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/learnTopic")
	public void addLearnTopic(@RequestBody LearnTopic  topic) {
		service.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/learnTopic/{id}")
	public void DelTopicById(@PathVariable String id) {
		service.DelTopicById(id);
	}
}
