package com.danhdt.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.danhdt.demo.model.User;
import com.danhdt.demo.repository.IUserRepository;
import com.danhdt.demo.service.IUserService;

public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(long id) {
		userRepository.deleteById(id);
	}

}
