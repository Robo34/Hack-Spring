package com.example.demo.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppUser;
import com.example.demo.service.AppUserService;

import lombok.extern.log4j.Log4j2;

@RestController()
@RequestMapping("/users")
@Log4j2
public class AppUserController {
	
	@Autowired
	AppUserService appUserService;
	
	@PostMapping()
	public AppUser getUser(@RequestBody AppUser appUser) {
		log.info(()-> "" + appUser);
		return appUserService.add(appUser);
	}
	
	@GetMapping()
	public List<AppUser> getAll() {
		return appUserService.getAll();
	}
	
	@GetMapping("/add")
	public long add(@RequestParam long x, @RequestParam long y) {
		return x+y;
	}

	@GetMapping("/name/{name}")
	public AppUser getByName(@PathVariable String name) {
		return appUserService.getName(name);
	}

	
}
