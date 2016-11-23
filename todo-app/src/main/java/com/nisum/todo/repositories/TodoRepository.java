package com.nisum.todo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.nisum.todo.model.Todo;
import com.nisum.todo.model.User;

@RestResource
public interface TodoRepository extends CrudRepository<Todo, Long>{
	public List<Todo> findAllByUser(User user);
}
