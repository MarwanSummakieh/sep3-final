package com.sep4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesService {
	
	@Autowired
	MessagesDao dao;
	
	public List<Messages> findAll() {
		return dao.findAll();
	}

	public void postMessage(Messages messages) {
		dao.save(messages);
	}

	public Messages getMessagesByReciever(Users sender) {
		Messages message = dao.findBySender(sender);

		return message;
	}
	

}
