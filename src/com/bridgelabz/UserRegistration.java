package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class UserRegistration {
    //variables
    private Pattern pattern;
    private Matcher matcher;
    private String firstName = "^[A-Z]([a-z]{2,15})*";
    private String lastName = "^[A-Z]([a-z]{2,15})*";
    private String eMail = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private String phoneNo ="^[91]+[ ]{0,1}+[1-9][0-9]{9}$";
    private String password = "^[0-9A-Za-z]*[!@#$%&][A-Za-z0-9]*$";
    Scanner sn = new Scanner(System.in);

    public UserRegistration() {
        pattern = pattern.compile(firstName);
        pattern = pattern.compile(lastName);
        pattern =pattern.compile(eMail);
        pattern = pattern.compile(phoneNo);
        pattern = pattern.compile(password);
    }

    /*Boolean method to validate FirstName*/
    public boolean validateFirstName(String firstName) {
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    /*Boolean method to validate LastName*/
    public boolean validateLastName(String lastName) {
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    /*Boolean method to validate Email*/
    public boolean validateEMail(String eMail)
    {
        matcher = pattern.matcher(eMail);
        return matcher.matches();
    }

    /*Boolean method to validate PhoneNo*/
    public boolean validatePhoneNo(String phoneNo)
    {
        matcher = pattern.matcher(phoneNo);
        return matcher.matches();
    }

    /*Boolean method to validate Password*/
    public boolean validatePassword(String password)
    {
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    /*Main method to print true if validation is correct or print false*/
    public static void main(String[] args)
     {
         UserRegistration userRegistration = new UserRegistration();
         System.out.println(userRegistration.validateFirstName("Nam"));
         System.out.println(userRegistration.validateLastName("She"));
         System.out.println(userRegistration.validateEMail("abc+100@gmail.com"));
         System.out.println(userRegistration.validatePhoneNo("91 9587823545"));
         System.out.println(userRegistration.validatePassword("A$bcd4ehlkl"));

       }
}