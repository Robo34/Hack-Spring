package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	//AppUser findByName(String name);
	AppUser findFirstByName(String name);
}
