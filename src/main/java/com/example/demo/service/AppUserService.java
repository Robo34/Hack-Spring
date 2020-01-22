package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;

@Service
public class AppUserService {
	
	@Autowired
	AppUserRepository repository;
	
	public AppUser add(AppUser user) {
		return repository.save(user);
	}
	
	public List<AppUser> getAll(){
		return repository.findAll();
	}
	
	public AppUser getName(String userName) {
		return repository.findByName(userName);
	}
}
