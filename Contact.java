package com.kpayne.contact;

public class Contact {
	
	private final String contactID;  // cannot be changed after created
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address)
	{
		// contact ID cannot be null or longer than 10 characters
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID.");
		}
		
		// first name cannot be null or longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		
		// last name cannot be null or longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		
		// phone number cannot be null and has to be 10 characters
		if (phone == null || !phone.matches("\\d{10}")) {
		    throw new IllegalArgumentException("Invalid phone number.");
		}
		
		
		// address cannot be null and must be less than 30 characters
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		
		// store fields in the object
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;	
	}
	
	// returns the contactID
	public String getContactId() {
		return contactID;
	}
	
	//returns first name
	public String getFirstName() {
		return firstName;
	}
	
	// changes the first name after validating it
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		
		this.firstName = firstName;
	}
	
	// returns the last name
	public String getLastName() {
		return lastName;
	}

	// changes the last name after validating it
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name.");
        }
        this.lastName = lastName;
    }

    // Returns the phone number.
    public String getPhone() {
        return phone;
    }

    // Updates the phone number after validating it.
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number.");
        }
        this.phone = phone;
    }

    // Returns the address.
    public String getAddress() {
        return address;
    }

    // Updates the address after validating it.
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address.");
        }
        this.address = address;
    }
	
	
	
	
	
	
	
	
	
	
	
}
