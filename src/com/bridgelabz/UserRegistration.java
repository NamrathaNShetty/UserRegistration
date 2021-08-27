package com.bridgelabz;


import java.util.regex.Pattern;


    public class UserRegistration {
        //variables

        private String firstName = "^[A-Z]([a-z]{2,15})*";
        private String lastName = "^[A-Z]([a-z]{2,15})*";
        private String eMail = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        private String phoneNo = "^[91]+[ ]{0,1}+[1-9][0-9]{9}$";
        private String password = "^[0-9A-Za-z]*[!@#$%&][A-Za-z0-9]*$";

        /*Validate all the emails*/
        public boolean validateEMail(String eMail) {
            return Pattern.matches(this.eMail, eMail);
        }
    }