package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

public class ContactController {
	@Autowired
	private ContactService contactservice;
	@PostMapping("/contact")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addContact(@RequestBody Contact contact) {
		contactservice.addDetails(contact);
	}
	

}
