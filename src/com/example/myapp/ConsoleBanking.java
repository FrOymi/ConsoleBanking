package com.example.myapp;

import com.example.myapp.Interface;

public class ConsoleBanking {
    // Test code
    static void main() {
        String rt;
        while (true) {
            rt = Interface.showAuthorizationPage();
            switch (rt) {
                case "1":
                    if (Interface.showLogInPage()) {
                        continue;
                    }
                    break;
                case "2":
                    // TODO: implement this later
                case "3":
                    System.exit(0);
            }
        }
    }
}
