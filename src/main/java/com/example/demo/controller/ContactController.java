package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;
@RestController
public class ContactController {
	@Autowired
	private ContactService contactservice;
	@Autowired
	private ContactRepository contactRepository;

	//add contact
	@PostMapping("/contactpost")
	public String addBook(@RequestBody Contact contact) {
		contactservice.addContact(contact);
		return "Contact added";

	}
//get all contacts
	@GetMapping("/contacts")
	public List<Contact> allContacts() {
		return contactservice.allContacts();
	}
//delete contact
	@DeleteMapping("/delete/{id}")
	public void deleteContact(@PathVariable(value = "id") int id) {
		contactRepository.deleteById(id);
	}
//get
	@GetMapping("/contact{id}")
	public Optional<Contact> getById(@PathVariable Integer id) {
		return contactservice.getById(id);
		
	}
}
