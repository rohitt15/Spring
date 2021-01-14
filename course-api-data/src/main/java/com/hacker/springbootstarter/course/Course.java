package com.hacker.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.hacker.springbootstarter.topic.Topic;

//using the entity we can create a table in database with same name like class
@Entity
//here we are creating 1 modal class which has private variable
public class Course {
	
	//using Id annotation we are making id as primary key
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne //here we are creting the foreign key reference
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public Course() {
		
	}
	public Course(String id, String name, String description,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic =new Topic(topicId,"","");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
}
