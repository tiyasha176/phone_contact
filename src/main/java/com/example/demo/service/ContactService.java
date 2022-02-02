package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {
@Autowired
private ContactRepository contactRepository;

public void addDetails(Contact contact) {
	contactRepository.save(contact);
}
	
}

