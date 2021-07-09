package com.learning.learn;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LearnTopic {
	@Id
	private String topicId;
	private String topicname;
	private String description;
/*private int date;
	public  int getDate() {
	return date;
}

public void setDate(int date) {
	this.date = date;
}
*/public LearnTopic() {

}
	public LearnTopic(String topicId, String topicname, String description) {
		super();
		this.topicId = topicId;
		this.topicname = topicname;
		this.description = description;
		
	}
	
	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getTopicname() {
		return topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
		
}
