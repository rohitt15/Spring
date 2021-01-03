package com.hacker.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=Arrays.asList(
			new Topic("spring", "Spring Framework","Spring Framework description"),
			new Topic("java", "Core Java","Core Java description"),
			new Topic("erp", "Erp","ERP description"));
	
	public List<Topic> getAllTopice(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		for(Topic top:topics) {
			if(top.getId().equalsIgnoreCase(id))
				return top;
			}
		return null;
		
	}
	//here we are using lambda expression stream api method
	/*public Topic getTopic(String id) {
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		
	}*/
}
