package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;


@Service
public class ContactServiceImpl implements ContactService {

	
	List<Contact> list = List.of(
			new Contact(1L, "pk@gmail.com","Prajwal", 1311L),
			new Contact(4L, "pk101@gmail.com","Prajwal", 1311L),
			new Contact(2L, "nagen@gmail.com","Nagen", 1312L),
			new Contact(3L, "prabhat@gmail.com","Prabhat", 1313L)
			);
			
			
			
	@Override
	public List<Contact> getContactOfUser(Long userID) {
		return this.list.stream().filter(contact->contact.getUserID().equals(userID)).collect(Collectors.toList());
	}

}
