package com.example.demo.view;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppUser;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class RestDemo {

//	rivate static final Logger log = LoggerFactory.getLogger(RestDemo.class);

	//@Value("abc")
	@Value("${demo.wartosc}")
	String x;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello " + x;//new Date();
	}
	
	@GetMapping("/hello/{id}")
	public AppUser getUser(@PathVariable long id) {
		log.info(()-> "getUser-view-restDemo");
		return new AppUser(id,"Jan","", new ArrayList<>());
	}
	
	@GetMapping("/add")
	public long add(@RequestParam long x, @RequestParam long y) {
		return x+y;
	}
	
	@PostMapping("/user")
	public AppUser helloUser(@RequestBody AppUser user) {
//		private RestTemplateBuilder r = new RestTemplateBuilder(); // WebClient = RestTemplate - czytanie restow
		
		return new AppUser(123L, user.getName(), user.getPassword(), new ArrayList<>());
	}
	
	
}
