package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Contact {

	private Long cID;
	private String email;
	private String contactName;
	
	private Long userID;
	
	
}
