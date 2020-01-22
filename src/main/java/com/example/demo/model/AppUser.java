package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppUser {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String password;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "creator")
	List<Document> docs = new ArrayList<>();
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public AppUser() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public AppUser(Long id, String name, String password) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.password = password;
//	}
}




// plik DTO - Doser
/*
class AppUserDTO {	
	Long id;
	String name;
	String password;
}

class DocumentDTO {
	Long id;
	String name;
	String content;
	
	AppUser creator;
} */