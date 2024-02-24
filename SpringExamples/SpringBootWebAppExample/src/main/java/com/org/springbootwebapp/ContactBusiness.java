package com.org.springbootwebapp;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
	public List<Contact> getContactList() {
		
		List<Contact> listContact = new ArrayList<>();

		listContact.add(new Contact("Rohini", "rohini@gmail.com", "USA"));
		listContact.add(new Contact("Keerthi", "keerthi@outlook.com", "USA"));
		listContact.add(new Contact("Vishal", "vishal@yahoo.com", "USA"));
		listContact.add(new Contact("Satya", "satya@gmail.com", "India"));
		listContact.add(new Contact("Sai", "sai@gmail.com", "India"));
		return listContact;
	}
}
