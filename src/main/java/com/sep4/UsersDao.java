package com.sep4;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsersDao extends CrudRepository<Users, Integer> {

	@Override
	List<Users> findAll();

	Users findByUsername(String username);

}
