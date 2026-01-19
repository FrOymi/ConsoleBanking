package com.example.myapp;

import java.util.Scanner;

public class Interface {
    static Scanner sc = new Scanner(System.in);
    static String error = "";
    public static String showAuthorizationPage() {
        System.out.print("===============================\n" +
                "Authorization in ConsoleBanking\n" +
                "===============================\n" +
                " Log In               |    1\n" +
                " Create a new account |    2   \n" +
                " Exit                 |    3\n" +
                "---------------------- --------\n" +
                error +
                "Input >>> ");
        String selectedButton = sc.nextLine();
        if (selectedButton.equals("1") || selectedButton.equals("2") || selectedButton.equals("3")) {
            return selectedButton;
        }
        error = "Invalid input\n";
        return showAuthorizationPage();
    }

    public static Boolean showLogInPage() {
        String[] data = {"", ""};
        for (int i = 0; i<=data.length; i++) {
            System.out.print("===============================\n" +
                    "   ---LogIn ConsoleBanking---\n" +
                    "===============================\n" +
                    "Email: " + data[0] + "\n" +
                    "Password: " + data[1] + "\n" +
                    "--------------- ----------------\n" +
                    "  1. Enter     |      2. Back\n" +
                    "--------------- ----------------\n" +
                    "Input >>> ");
            String usrInput = sc.nextLine();
            if (usrInput.equals("1")) {
                // TODO: implement this later
            } else if (usrInput.equals("2")) {
                break;
            } else {
                data[i] = usrInput;
            }
        }
        return true;
    }
}

class InputProcessing {
    // TODO: implement this later
}
