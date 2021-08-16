package com.contact.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Contact {

	private Long cID;
	private String email;
	private String contactName;
	
	private Long userID;
	
	
}
