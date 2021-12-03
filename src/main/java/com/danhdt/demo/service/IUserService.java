package com.danhdt.demo.service;

import com.danhdt.demo.model.User;

public interface IUserService {
	User findUserByEmail(String email);
	User save(User user);
	void delete(long id);
}
