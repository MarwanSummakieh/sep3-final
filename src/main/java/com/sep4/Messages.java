package com.sep4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Messages")
public class Messages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "sender",  nullable = false)
	private String sender;
	@Column(name = "reciever",  nullable = false)
	private String reciever;
	@Column(name = "body", length = 2000000)
	private String body;
	
	public Messages() {
		
	}
	
	

	public Messages(String sender, String reciever, String body) {
		
		this.sender = sender;
		this.reciever = reciever;
		this.body = body;
	}



	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReciever() {
		return reciever;
	}

	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public String toString() {
		return "Owner [id=" + id + ", sender= " + sender + ", reciever= " + reciever + ", body= " + body + "]";
	}
	
	
	
	
	
}
