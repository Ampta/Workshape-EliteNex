package day_4.ATM;

import java.util.Scanner;

public class AtmSimulation {

    static String lastTransaction = "No Transaction yet.";
    static Scanner sc = new Scanner(System.in);

    public static void checkBalance(Account account){
        System.out.println("Current Balance: " + account.balance);
    }


    public static void depositBalance(Account account){
        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        if(amount > 0){
            account.deposit(amount);
            System.out.println("Deposit Successfully");
            System.out.println("Current Balance: " + account.balance);
            lastTransaction = "Deposit: " + amount + " rupees";
        }else {
            System.out.println("Amount Cannot be negative: " + amount);
        }

    }

    public static void withdrawBalance(Account account){
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        if(amount > 0){
            account.withdraw(amount);
            System.out.println("Withdraw Successfully");
            System.out.println("Current Balance: " + account.balance);
            lastTransaction = "Withdraw: " + amount + " rupees";
        }else{
            System.out.println("Amount Cannot be negative: " + amount);
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        System.out.println(account.balance);


        int choice = 0;

        while(choice != 5){

            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");

            System.out.print("\nEnter Here: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    checkBalance(account);
                    break;
                case 2:
                    depositBalance(account);
                    break;
                case 3:
                    withdrawBalance(account);
                    break;
                case 4:
                    System.out.println(lastTransaction);
                    break;
                case 5:
                    System.out.println("Application close.");
                    break;
                default:
                    System.out.println("Invalid Input, Please try again.");
            }

        }
    }
}
