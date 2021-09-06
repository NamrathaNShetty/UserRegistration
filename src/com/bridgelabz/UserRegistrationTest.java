package com.bridgelabz;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {

    UserRegistration validator = new UserRegistration();

    // Test cases to validate First Name and Last Name.
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        String FirstName = "Namratha";
        assertTrue(validator.Name(FirstName));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        String FirstName = "Na";
        assertFalse(validator.Name(FirstName));
    }

    // Test cases to validate Email
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        String eMail = "mfjkd@bl.co";
        assertTrue(validator.Email(eMail));
    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnFalse() {
        String eMail = "namra79*@bl.co";
        assertFalse(validator.Email(eMail));
    }
    // Test cases to validate Phone number
    @Test
    public void givenNumber_WhenValid_ShouldReturnTrue() {
        String phoneNo= "91 1234567890";
        assertFalse(validator.Email(phoneNo));
    }

    @Test
    public void givenNumber_WhenNotValid_ShouldReturnFalse() {
        String phoneNo = "1234567890";
        assertFalse(validator.Email(phoneNo));
    }

    //  // Test cases to validate Password
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        String password = "Abcd1234$";
        assertTrue(validator.password(password));
    }

    @Test
    public void givenPassword_WhenNotValid_ShouldReturnFalse() {
        String password = "Abcdefgh";
        assertFalse(validator.password(password));
    }
}