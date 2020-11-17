package com.heraizen.cj.day4.Manager;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.heraizen.cj.day4.Service.ContactService;
import com.heraizen.cj.day4.Service.ContactServiceImpl;
import com.heraizen.cj.day4.domain.Contact;
import com.heraizen.cj.day4.exception.DuplicationEmailException;

public class ContactOperations {
	ContactService contactService = ContactServiceImpl.getInstance();
	Scanner sc = null;
	public void start() {
		this.sc = new Scanner(System.in);
		do {
			System.out.println(
					"\n---------------------------Employee Management System-------------------------------------\n");
			System.out.println("1.ADD\t2.VIEW ALL\t3.EDIT\t4.DELETE\t5.EXIT ");
			System.out.println(
					"\n------------------------------------------------------------------------------------------\n");
			int choice = this.getUserChoice();
			switch (choice) {
			case 1:
				this.addContact();
				break;

			case 2:
				this.viewContact();
				break;
			case 3:
				this.editContact();
				break;
			case 4:
				this.deleteContact();
				break;
			case 5: {
				System.out.println("Bye............");
				this.sc.close();
				System.exit(0);
			}
			}
		} while (true);
	}
	private void viewContact() {
	Contact[] crr= this.contactService.getContacts();
	System.out.println("-----------------All the Contact Details--------------------------");
	System.out.format("\n%-8s%-10s%-20s%-20s\n","ID","Name","Email", "Mobile Number");
	System.out.println("------------------------------------------------------------------");
	for(Contact a:crr) {
		printContact(a);
	}

	}

	private void printContact(Contact contact) {
		if(contact!=null) {
			
		
		System.out.format("\n%-8d%-10s%-20s%-20s\n", contact.getId(), contact.getName(),
				contact.getEmail(), contact.getMobileNumber());
		}else {
			return;
		}
//		System.out.print(contact.getId());
//		System.out.print(contact.getName());
//		System.out.print(contact.getEmail());
//		System.out.print(contact.getMobileNumber());
	}
	private void addContact() {
		System.out.println("Enter the name :");
		String name = this.sc.nextLine();
		
		String email = this.checkUserEmail();
		
		String mobile = this.getValidMobileInput();
		
		Contact contact = new Contact.ContactBuilder().withName(name).withMobile(mobile).withEmail(email).build();
		System.out.println("Please wait .......................... ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		contact = this.contactService.addContact(contact);
		if (contact != null) {
			System.out.println("Employee is added successfully with id :" + contact.getId());
		} else {
			System.out.println("Something went wrong while adding employee");
		}
	}
	private int getUserChoice() {
		int choice;
		choice = Integer.parseInt(this.sc.nextLine());
		return choice;
		
	}
	
	private void deleteContact() {
		int contactId=getUserInputEmpno();
		Contact contact=contactService.getContact(contactId);
		while(contact==null){
			System.out.println("With the entred contact id, there is no contact...");
			contactId = getUserInputEmpno();
			contact=contactService.getContact(contactId);
		}
		
		System.out.println("Are sure do want to delete contact (y/n) ");
		String choice=sc.nextLine();
		if(choice.equalsIgnoreCase("y")){
			contactService.deleteContact(contactId);
			System.out.println("Contact with contactId :"+contactId+" is deleted successfuly ");
		}

	}
	
	private void editContact() {
		int contactId=getUserInputEmpno();
		Contact contactObj=contactService.getContact(contactId);
		while(contactObj==null){
			contactId = getUserInputEmpno();
			contactObj=contactService.getContact(contactId);
		}
		System.out.println("Contact details to edit:");
		printContact(contactObj);
		System.out.println("\nUpdate 1.Mobile 2. Email");
		boolean isNumber = true;
		int choice = 0;
		try {
			choice = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			isNumber = false;
		}
		while (!(choice > 0 && choice < 2 || isNumber)) {
			System.out.println("Choice must be 1 to 2 only");
			try {
				choice = Integer.parseInt(this.sc.nextLine());
			} catch (NumberFormatException e) {
				isNumber = false;
			}
		}
		
	    String mobile=null,email=null, names=null;
	   
		if(choice==1){
			 mobile = getValidMobileInput();
		}else if(choice==2) {
			email=checkUserEmail();
		}
		
			
		Contact contact = new Contact.ContactBuilder().withName(names==null?contactObj.getName():names).
				withMobile(mobile==null?contactObj.getMobileNumber():mobile).withEmail(email==null? contactObj.getEmail():email).build();
		
	    boolean isupdated=contactService.updateContact(contactObj.getId(),contact);
	    if(isupdated) {
	    	System.out.println("Contact with contactId :"+contactId+" is updated successfuly ");
	    } else {
	    	System.out.println("Something went wrong at the time of updation");
	    }
	    
		
	}
     
	private int getUserInputEmpno() {
		boolean isNumber = false;
		int id = 0;
		System.out.println("Enter the ContactId :");
		try {
			id = Integer.parseInt(this.sc.nextLine());
		} catch (NumberFormatException e) {
			isNumber = true;
		}
		while (id <= 0 && isNumber) {
			System.out.println("Enter valid contact id : must be > 0");
			try {
				id = Integer.parseInt(this.sc.nextLine());
			} catch (NumberFormatException e) {
				isNumber = true;
			}
		}
		return id;
	}

	private String getValidMobileInput() {
		System.out.println("Enter the mobile number :");
		String mobile = this.sc.nextLine();
		while (!this.checkContainDigits(mobile)) {
			System.out.println("Enter the valid mobile number :");
			mobile = this.sc.nextLine();
		}
		return mobile;
	}

	private boolean checkContainDigits(String mobile) {
		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(mobile);
		boolean isvalid = matcher.matches();
		return isvalid;
	}
	private boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	private String checkUserEmail() {
		boolean isEmailExits = false;
		boolean isValid = false;
		System.out.println("Enter the email : Ex (abc@gmail.com) :");
		String email = this.sc.nextLine();
		while (!isValid) {
			isValid = this.isValidEmail(email);
			if (isValid)
				break;
			System.out.println("Enter the email : Ex (abc@gmail.com) :");
			email = this.sc.nextLine();
		}
		try {
			ContactServiceImpl.checkEmail(email);
		} catch (DuplicationEmailException e) {
			System.out.println("Email :" + email + " already assign to some other employee \n");
			isEmailExits = true;
		}
		if (isEmailExits) {
			this.checkUserEmail();
		}
		return email;
	}
	
	
	
}
