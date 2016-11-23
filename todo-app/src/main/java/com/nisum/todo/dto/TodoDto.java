package com.nisum.todo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nisum.todo.model.Todo;

public class TodoDto {
	private long id;
	private String title;
	private Date createdOn;

	private Boolean completed;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	public TodoDto(){
		super();
	}

	public TodoDto(long id, String title, Date createdOn, Boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.createdOn = createdOn;
		this.completed = completed;
	}
	
	public TodoDto(Todo todo){
		super();
		this.id = todo.getId();
		this.title = todo.getTitle();
		this.completed = todo.getCompleted();
		this.createdOn = todo.getCreateOn();
	}
	
	public List<TodoDto> convertList(List<Todo> todo){
		List<TodoDto> listTodoDTO = new ArrayList<TodoDto>();
		if(!todo.isEmpty()){
			for(Todo todoIterator: todo){
				TodoDto todoDTO = new TodoDto(todoIterator);
				listTodoDTO.add(todoDTO);
			}
		}
		return listTodoDTO;
	}
}
