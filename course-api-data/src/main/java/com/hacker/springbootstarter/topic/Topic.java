package com.hacker.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

//using the entity we can create a table in database with same name like class
@Entity
//here we are creating 1 modal class which has private variable
public class Topic {
	
	//using Id annotation we are making id as primary key
	@Id
	private String id;
	private String name;
	private String description;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public Topic() {
		
	}
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
