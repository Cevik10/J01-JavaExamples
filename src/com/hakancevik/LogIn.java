package com.hakancevik;
// Log in

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sys_nickname = "Cevik10";
        String sys_password = "SocratesDialectic";
        int remainingRight = 2;

        while (true) {
            System.out.println("_________________________________________________________________\n");
            System.out.print("Nickname: ");
            String nickname = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();


            if (remainingRight == 0) {
                System.out.println("Failed login! a recovery code has been sent to your e-mail.\n");
                System.out.println("_________________________________________________________________\n");
                break;
            }
            else if ((sys_nickname.equals(nickname)) && (sys_password.equals(password))) {
                System.out.println("Successfully logged in.\n");
                System.out.println("_________________________________________________________________\n");

                break;
            }
            else {

                System.out.println("The Username or Password provided is incorrect\"");
                System.out.println("The remaining entry right --> " + remainingRight+"\n");
                remainingRight--;


            }
        }

    }
}
