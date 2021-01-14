package com.hacker.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
 
	@Autowired
	private TopiceRepository topRepository;
	
	public List<Topic> getAllTopice(){
		List<Topic> topics=new ArrayList<>();
		topRepository.findAll().forEach(topics::add);
				 return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topRepository.findById(id);

	}
	public void getAddTopic(Topic topic) {
		topRepository.save(topic);
	}

	public void updateTopice(String id, Topic topic) {
		topRepository.save(topic);
	}

	public void deleteTopice(String id) {
		topRepository.deleteById(id);
	}
}
