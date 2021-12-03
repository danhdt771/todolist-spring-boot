package com.danhdt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danhdt.demo.model.Todo;

@Repository
public interface ITodoRepository extends JpaRepository<Todo, Long> {
	Todo findTodoByUserId(long userId);
	Todo findTodoByUserIdAndTitle(long userId, String title);
}
