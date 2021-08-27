package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain
{
    public  void validateUserData() {
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        while (check)
        {
            System.out.println("1.First Name  2.Last Name  3.EMail  4.PhoneNo 5.Password  6.Quit");
            int option = scanner.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter First Name");
                    String firstName = scanner.next();
                    System.out.println(userRegistration.validateFirstName(firstName));
                    break;

                case 2:
                    System.out.println("Enter Last Name");
                    String lastName = scanner.next();
                    System.out.println(userRegistration.validateLastName(lastName));
                    break;

                case 3:
                    System.out.println("Enter Valid Email");
                    String eMail = scanner.next();
                    System.out.println(userRegistration.validateEMail(eMail));
                    break;

                case 4:
                    System.out.println("Enter Phone No");
                    String phoneNo = scanner.next();
                    System.out.println(userRegistration.validatePhoneNo(phoneNo));
                    break;

                case 5:
                    System.out.println("Enter Password");
                    String password = scanner.next();
                    System.out.println(userRegistration.validatePassword(password));
                    break;

                case 6:
                    check = false;

            }
        }
    }

    public static void main(String[] args)
    {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        userRegistrationMain.validateUserData();
    }
}
