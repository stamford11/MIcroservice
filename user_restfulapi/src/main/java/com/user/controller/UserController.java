package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.UserEntity;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// to get everything from contact in user page from contact
	@Autowired
	private RestTemplate restTemplate;

	/*
	 * @GetMapping("/{userID}") public UserEntity
	 * getUser(@PathVariable("userID")Long userID) {
	 * 
	 * return userService.getUser(userID); }
	 */
	
	
	@GetMapping("/{userID}")
	public UserEntity getUser(@PathVariable("userID") Long userID) {
		UserEntity user = userService.getUser(userID);
		//List<Contact> contacts = restTemplate.getForObject("http://localhost:9002/contact/user/" + user.getUserID(),List.class);
		
		//we can rewrite localhost as the spring application name we give to it, but we need to add  @LoadBalanced
		List<Contact> contacts = restTemplate.getForObject("http://contact-server/contact/user/" + user.getUserID(),List.class);
		user.setContacts(contacts);
		return user;
	}
}
