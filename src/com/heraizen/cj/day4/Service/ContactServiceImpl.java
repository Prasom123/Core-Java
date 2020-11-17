package com.heraizen.cj.day4.Service;

import com.heraizen.cj.day4.domain.Contact;
import com.heraizen.cj.day4.exception.DuplicationEmailException;

public class ContactServiceImpl implements ContactService {
	private static ContactServiceImpl contactServiceImpl = null;

	private static Contact[] crr = new Contact[2];
	 private int icount=2;

	private ContactServiceImpl() {

		crr=getContactData();
	}

	public static ContactServiceImpl getInstance() {
		if (contactServiceImpl == null) {
			synchronized (ContactServiceImpl.class) {
				if (contactServiceImpl == null) {
					contactServiceImpl = new ContactServiceImpl();
				}
			}
		}
		return contactServiceImpl;
	}

	public Contact addContact(Contact contact) {
	    if(icount<crr.length){
            
            crr[icount++]=contact;
  
     }
	    else{

            Contact b[]=new Contact[crr.length+crr.length];
            System.arraycopy(crr, 0, b, 0, crr.length);
             b[icount++]=contact;
             crr=b;
       }

		return contact;
	}

	
	@Override
	public Contact[] getContacts() {
		System.out.println("crr.length" + crr.length);
		return crr;
	}

	@Override
	public boolean updateContact(int id, Contact contact) {
		boolean flag = false;
		for (int i = 0; i < crr.length; i++) {
			if (crr[i].getId() == id) {
				crr[i] = contact;
				flag = true;
				break;
			} else {
				flag = false;
			}

		}
		return flag;
	}

	@Override
	public void deleteContact(int id) {

		 Contact[] newArr = null;
		for(int i = 0; i < crr.length; i++){
		      if(crr[i].getId() == id){
		        newArr = new Contact[crr.length - 1];
		        for(int index = 0; index < i; index++){
		          newArr[index] = crr[index];
		        }
		        for(int j = i; j < crr.length - 1; j++){
		          newArr[j] = crr[j+1];
		        }
		        break;
		      }
		    }
		    crr=newArr;
		
	}

	

	@Override
	public Contact getContact(int id) {
		Contact contact = null;
		for (Contact a : crr) {
			if (a.getId() == id) {
				contact = a;
				break;
			} else {
				contact = null;
			}
		}
		return contact;
	}
	

	public Contact[] getContactData() {

		Contact c1 = new Contact.ContactBuilder().withName("Badal").withEmail("badal@gmail.com")
				.withMobile("8298657870").build();
		Contact c2 = new Contact.ContactBuilder().withName("Prasom").withEmail("prasom@gmail.com")
				.withMobile("6360698596").build();

		return new Contact[] {c1, c2};
	}
	public  static boolean checkEmail(String email) throws DuplicationEmailException {
		boolean isfound = false;
		for (Contact c : crr) {
			if (c.getEmail().equals(email)) {
				isfound = true;
				break;
			} else {
				isfound = false;
			}
		}
		if (isfound) {
			throw new DuplicationEmailException();
		}
		return isfound;
	}
	

}
