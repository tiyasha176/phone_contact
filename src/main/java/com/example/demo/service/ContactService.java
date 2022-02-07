package com.example.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {
@Autowired
private ContactRepository contactRepository;

//add contact
public Contact addContact(Contact contact) {
	return contactRepository.save(contact);
}

//delete contact
public void deleteContact(Integer Id)
{
	contactRepository.deleteById(Id);
}

//get all contacts
public List<Contact> allContacts() {
	// TODO Auto-generated method stub
	return (List<Contact>) contactRepository.findAll();
	
}
//get

public Optional<Contact> getById(Integer id) {
	// TODO Auto-generated method stub
	return contactRepository.findById(id);
	}



}