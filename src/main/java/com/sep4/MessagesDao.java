package com.sep4;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface MessagesDao extends CrudRepository<Messages, Integer>{
	@Override
	List<Messages> findAll();
	
	Messages findBySender(Users sender);

}
