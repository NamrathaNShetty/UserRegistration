package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
    private Pattern pattern;
    private Matcher matcher;
    private String firstName = "^[A-Z]([a-z]{2,15})*";
    private String lastName = "^[A-Z]([a-z]{2,15})*";
    Scanner sn = new Scanner(System.in);

    public UserRegistration() {
        pattern = pattern.compile(firstName);
        pattern = pattern.compile(lastName);


    }
    public boolean validateFirstName(String firstName) {
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validateLastName(String lastName) {
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static void main(String[] args)
     {
           UserRegistration userRegistration = new UserRegistration();
         System.out.println(userRegistration.validateFirstName("Nam"));
         System.out.println(userRegistration.validateLastName("She"));
       }
}