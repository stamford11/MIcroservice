package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserEntity {

	private Long userID;
	private String name;
	private String phone;
	
	List<Contact> contacts = new ArrayList<>();

	public UserEntity(Long userID, String name, String phone) {
		super();
		this.userID = userID;
		this.name = name;
		this.phone = phone;
	}
	
	
	
}
