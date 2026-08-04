package com.kpayne.contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
	// stores each Contact object using the contactID as they key
	private final Map<String, Contact> contacts;
	
	// this creates an empty collection when the service is created.
	public ContactService() {
		contacts = new HashMap<>();
	}
	
	// add a new contact to the collection contacts
	public void addContact(Contact contact) {
		
		if (contact == null) {
			throw new IllegalArgumentException("Contact cannot be null");
		}
		
		String contactID = contact.getContactId();
		
		if (contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("A contact with this ID exists already");
		}
		
		contacts.put(contactID, contact);
	}
	
	// Deletes a contact objects using its contactID
	public void deleteContact(String contactID) {
		
		if(!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Contant doesn't exits");
		}
		contacts.remove(contactID);
	}
	
	// Updates the first name of the contact with the same contactID
    public void updateFirstName(String contactId, String firstName) {
        Contact contact = findContact(contactId);
        contact.setFirstName(firstName);
    }

    // Updates the last name of the contact with the matching ID
    public void updateLastName(String contactId, String lastName) {
        Contact contact = findContact(contactId);
        contact.setLastName(lastName);
    }

    // Updates the phone number of the contact with the matching ID
    public void updatePhone(String contactId, String phone) {
        Contact contact = findContact(contactId);
        contact.setPhone(phone);
    }

    // Updates the address of the contact with the matching ID
    public void updateAddress(String contactId, String address) {
        Contact contact = findContact(contactId);
        contact.setAddress(address);
    }

    // Returns a contact using its ID.
    // This will also help verify service behavior in the JUnit tests
    public Contact getContact(String contactId) {
        return findContact(contactId);
    }

    // Finds and returns a contact using its ID.
    // This private method prevents the same search logic from being repeated.
    private Contact findContact(String contactId) {

        if (contactId == null || !contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist.");
        }

        return contacts.get(contactId);
    }
}
