package com.danhdt.demo.service;

import com.danhdt.demo.model.Todo;

public interface ITodoService {
	Todo findTodoById(long id);
	Todo findTodoByUserId(long userId);
	Todo findTodoByUserIdAndTitle(long userId, String title);
	Todo save(Todo todo);
	void delete(long id);
}
