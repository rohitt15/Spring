package com.hacker.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
 
	/*if we trying to insert the data in the topics object using getAddTopic method through post method,
	we will get error because Arrays.asList() is mutual,so we have to create the object for this.
	*/
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework","Spring Framework description"),
			new Topic("java", "Core Java","Core Java description"),
			new Topic("erp", "Erp","ERP description")));
	
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

	public void getAddTopic(Topic topic) {
		topics.add(topic);
	}
}
