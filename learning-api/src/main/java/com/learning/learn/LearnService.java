package com.learning.learn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LearnService {

	@Autowired
	private LearnTopiceRepository topRepository;
    SimpleDateFormat formatterr = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	Date d=new Date();
	
	
	List<LearnTopic> topics=new ArrayList(Arrays.asList
			(new LearnTopic("java","Core Java" ,"Core Java Description"),
			 new LearnTopic("j2ee","Advanced Java" ,"Advanced Java Description")));
	//LearnTopic topics;
	List<LearnTopic> topic=new ArrayList();
	public List<LearnTopic> getAllTopic() {
		 
		 topRepository.findAll().forEach(topic::add);
		 return topic ;
	}
	public LearnTopic getTopicById(String id) {
		for(int i=0;i<topics.size();i++) {
	if(topics.get(i).getTopicId().equals(id)) {
		return topics.get(i);

	}

}
		return null ;
	}
	public void addTopic(LearnTopic topic) {
//topics.add(topic);	
topRepository.save(topic);
	}
	public void DelTopicById(String id) {
		topRepository.deleteById(id);	
		
		}


}