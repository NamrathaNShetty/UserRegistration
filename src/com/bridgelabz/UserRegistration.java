package com.bridgelabz;


import java.util.regex.Pattern;


    public class UserRegistration {
    //variables

    private String firstName = "^[A-Z]([a-z]{2,15})*";
    private String lastName = "^[A-Z]([a-z]{2,15})*";
    private String eMail = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private String phoneNo ="^[91]+[ ]{0,1}+[1-9][0-9]{9}$";
    private String password = "^[0-9A-Za-z]*[!@#$%&][A-Za-z0-9]*$";

        /*Validate FirstName*/
        public  boolean validateFirstName(String firstName)
        {
            return Pattern.matches(this.firstName,firstName);
        }

        /*Validate LastName*/
        public  boolean validateLastName(String lastName)
        {

            return Pattern.matches(this.lastName,lastName);
        }

        /*Validate Email*/
        public boolean validateEMail(String eMail)
        {

            return Pattern.matches(this.eMail,eMail);
        }

        /*Validate Phone number*/
        public boolean validatePhoneNo(String phoneNo)
        {

            return Pattern.matches(this.phoneNo,phoneNo);
        }

        /*Validate Password*/
        public boolean validatePassword(String password)
        {

            return Pattern.matches(this.password,password);
        }
    }