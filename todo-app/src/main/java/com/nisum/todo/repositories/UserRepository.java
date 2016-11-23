package com.nisum.todo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.nisum.todo.model.User;

@RestResource
public interface UserRepository extends CrudRepository<User, Long>{
	public User findByUsername(String username);
}
