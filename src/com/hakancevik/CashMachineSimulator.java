package com.hakancevik;
// ATM simulation

import java.util.Scanner;

public class CashMachineSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   Welcome to CevikBank!");
        System.out.println("***************************");
        System.out.print("""
                1 --> Balance Inquiry
                2 --> Withdraw Funds
                3 --> Depositing Money
                4 --> Exit
                """);
        System.out.println("***************************\n");

        int funds = 2720;

        while (true) {

            System.out.println("_________________________________");
            System.out.print("Please select the operation: ");

            int operation = scanner.nextInt();
            switch (operation) {

                case 1:  // Balance Inquiry : bakiye sorgulama
                    System.out.println("Hello,");
                    System.out.println("Your current balance is : " + funds + " $");
                    break;

                case 2:  // Withdraw Funds : para çekme
                    System.out.print("How much cash do you want to get? >:");
                    int amountWithdrawn = scanner.nextInt();
                    if (funds >= amountWithdrawn) {
                        System.out.println("The amount withdrawn is : " + amountWithdrawn + " $");
                        funds -= amountWithdrawn;
                    } else {
                        System.out.println("Insufficient Funds!");
                        System.out.println("Your current balance is : " + funds + " $");
                    }
                    break;

                case 3:  // Depositing Money : para yatırma
                    System.out.print("Amount you want to deposit: ");
                    int depositAmount = scanner.nextInt();
                    System.out.println(depositAmount + " $ has been deposited into your account.");
                    funds += depositAmount;
                    break;

                case 4:
                    System.out.println("Have a nice day!..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("please select a valid operation!");
                    break;


            }

        }


    }
}
