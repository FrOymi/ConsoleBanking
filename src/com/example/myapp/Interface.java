package com.example.myapp;

import java.util.Scanner;

public class Interface {
    static Scanner sc = new Scanner(System.in);
    public static String showAuthorizationPage() {
        System.out.print("===============================\n" +
                "Authorization in ConsoleBanking\n" +
                "===============================\n" +
                " Log In               |    1\n" +
                " Create a new account |    2   \n" +
                " Exit                 |    3\n" +
                "---------------------- --------\n" +
                "Input >>> ");
        String selectedButton = sc.nextLine();
        if (selectedButton.equals("1") || selectedButton.equals("2") || selectedButton.equals("3")) {
            return selectedButton;
        }
        System.out.println("Invalid input");
        return showAuthorizationPage();
    }

    public static Boolean showLogInPage() {
        String email;
        String password;
        System.out.print("===============================\n" +
                "   ---LogIn ConsoleBanking---\n" +
                "===============================\n" +
                "Email: " + email + "                 <<<\n" +
                "Password:\n" + password +
                "--------------- ----------------\n" +
                "  1. Enter     |      2. Back\n" +
                "--------------- ----------------\n" +
                "Input >>> ");
        String usrInput = sc.nextLine();
        if (usrInput.equals("1")) {

            // TODO: implement this later

        } else if (usrInput.equals("2")) {

            // TODO: implement this later

        }
    }
}

class InputProcessing {

}
