package com.heraizen.cj.day4.Service;

import com.heraizen.cj.day4.domain.Contact;

public interface ContactService {
	public Contact addContact(Contact contact);
	public Contact[] getContacts();
	
	public Contact getContact(int id);

	public boolean updateContact(int id, Contact contact);

	public void deleteContact(int id);

}
