package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.model.User;
import com.training.springmvc.respository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public void save(User user) {
		repo.save(user);
	}
	
	public List<User> listUsers(){
		return repo.findAll();
	}
	
	public User getUser(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteUser(int id) {
		repo.deleteById(id);
	}
	
}
