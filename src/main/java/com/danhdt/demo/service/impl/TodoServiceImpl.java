package com.danhdt.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.danhdt.demo.model.Todo;
import com.danhdt.demo.repository.ITodoRepository;
import com.danhdt.demo.service.ITodoService;

public class TodoServiceImpl implements ITodoService {

	@Autowired
	private ITodoRepository todoRepository;
	
	@Override
	public Todo findTodoById(long id) {
		return todoRepository.getById(id);
	}

	@Override
	public Todo findTodoByUserId(long userId) {
		return todoRepository.findTodoByUserId(userId);
	}

	@Override
	public Todo findTodoByUserIdAndTitle(long userId, String title) {
		return todoRepository.findTodoByUserIdAndTitle(userId, title);
	}

	@Override
	public Todo save(Todo todo) {
		return todoRepository.save(todo);
	}

	@Override
	public void delete(long id) {
		todoRepository.deleteById(id);
	}

}
