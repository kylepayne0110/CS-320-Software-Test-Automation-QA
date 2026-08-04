package com.kpayne.contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    // Tests that a contact can be added successfully.
    @Test
    public void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Kyle",
                "Payne",
                "9185551234",
                "123 Main St"
        );

        service.addContact(contact);

        assertEquals(contact, service.getContact("12345"));
    }

    // Tests that duplicate contact IDs are rejected.
    @Test
    public void testDuplicateContactId() {

        ContactService service = new ContactService();

        Contact contact1 = new Contact(
                "12345",
                "Kyle",
                "Payne",
                "9185551234",
                "123 Main St"
        );

        Contact contact2 = new Contact(
                "12345",
                "John",
                "Smith",
                "9185559999",
                "456 Oak St"
        );

        service.addContact(contact1);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.addContact(contact2)
        );
    }

    // Tests that a contact can be deleted using its ID.
    @Test
    public void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Kyle",
                "Payne",
                "9185551234",
                "123 Main St"
        );

        service.addContact(contact);
        service.deleteContact("12345");

        assertThrows(
                IllegalArgumentException.class,
                () -> service.getContact("12345")
        );
    }

    // Tests that all allowed contact fields can be updated.
    @Test
    public void testUpdateContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Kyle",
                "Payne",
                "9185551234",
                "123 Main St"
        );

        service.addContact(contact);

        service.updateFirstName("12345", "John");
        service.updateLastName("12345", "Smith");
        service.updatePhone("12345", "9185559999");
        service.updateAddress("12345", "456 Oak St");

        Contact updatedContact = service.getContact("12345");

        assertEquals("John", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("9185559999", updatedContact.getPhone());
        assertEquals("456 Oak St", updatedContact.getAddress());
    }
}