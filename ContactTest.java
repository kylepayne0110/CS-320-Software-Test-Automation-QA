package com.kpayne.contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

    // Tests that a valid contact can be created.
    @Test
    public void testValidContact() {

        Contact contact = new Contact(
                "12345",
                "Kyle",
                "Payne",
                "9185551234",
                "123 Main St"
        );

        assertEquals("12345", contact.getContactId());
        assertEquals("Kyle", contact.getFirstName());
        assertEquals("Payne", contact.getLastName());
        assertEquals("9185551234", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    // Tests that the contact ID cannot be null or longer than 10 characters.
    @Test
    public void testInvalidContactId() {

        assertThrows(IllegalArgumentException.class, () ->
                new Contact(null, "Kyle", "Payne",
                        "9185551234", "123 Main St"));

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345678901", "Kyle", "Payne",
                        "9185551234", "123 Main St"));
    }

    // Tests that the first name cannot be null or longer than 10 characters.
    @Test
    public void testInvalidFirstName() {

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", null, "Payne",
                        "9185551234", "123 Main St"));

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", "ABCDEFGHIJK", "Payne",
                        "9185551234", "123 Main St"));
    }

    // Tests that the last name cannot be null or longer than 10 characters.
    @Test
    public void testInvalidLastName() {

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", "Kyle", null,
                        "9185551234", "123 Main St"));

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", "Kyle", "ABCDEFGHIJK",
                        "9185551234", "123 Main St"));
    }

    // Tests that the phone must contain exactly 10 digits.
    @Test
    public void testInvalidPhone() {

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", "Kyle", "Payne",
                        null, "123 Main St"));

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", "Kyle", "Payne",
                        "12345", "123 Main St"));
    }

    // Tests that the address cannot be null or longer than 30 characters.
    @Test
    public void testInvalidAddress() {

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", "Kyle", "Payne",
                        "9185551234", null));

        assertThrows(IllegalArgumentException.class, () ->
                new Contact("12345", "Kyle", "Payne",
                        "9185551234",
                        "1234567890123456789012345678901"));
    }
}