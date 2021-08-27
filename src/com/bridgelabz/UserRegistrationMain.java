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
            System.out.println("1.EMail 2.Quit");
            int option = scanner.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter Valid Email");
                    String eMail = scanner.next();
                    System.out.println(userRegistration.validateEMail(eMail));
                    break;

                case 2:
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
