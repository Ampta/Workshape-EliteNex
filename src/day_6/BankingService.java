package day_6;

import java.util.ArrayList;
import java.util.Random;

public class BankingService implements IBankingService{
    static ArrayList<Account> accounts = new ArrayList<>();
    static Random random = new Random();

    @Override
    public void createAccount(String holderName, AccountType accountType, double initialBalance) {
        String bankName = "State Bank Of India";
        int id = 10 + random.nextInt(90);

        int accountNum = 1000 + random.nextInt(9000);
        String accountNumber;

        Account newAccount = null;

        if(accountType.equals(AccountType.SAVING) && initialBalance >= 1000){
            accountNumber = "SB" + accountNum;
            newAccount = new Account(id, bankName, accountNumber, holderName, accountType, initialBalance);
            System.out.println("Account Created Successfully Account Number: " + newAccount.getAccountNumber());
        }else if (accountType.equals(AccountType.CURRENT) && initialBalance >=0){
            accountNumber = "CR" + accountNum;
            newAccount = new Account(id, bankName, accountNumber, holderName, accountType, initialBalance);
            System.out.println("Account Created Successfully Account Number: " + newAccount.getAccountNumber());
        }else if(accountType.equals(AccountType.SALARY) && initialBalance > 0){
            accountNumber = "SL" + accountNum;
            newAccount = new Account(id, bankName, accountNumber, holderName, accountType, initialBalance);
            System.out.println("Account Created Successfully Account Number: " + newAccount.getAccountNumber());
        }else{
            System.out.println("Insufficient Balance to create new Account");
        }

        accounts.add(newAccount);
    }

    @Override
    public void working() {
        System.out.println("working");
    }

    @Override
    public void showDetails(String accountNumber) {
        for(Account account: accounts){
            if(accountNumber.equals(account.getAccountNumber())){
                System.out.println("\n=== Your Account details ===");
                System.out.println("Bank Name: " + account.getBankName());
                System.out.println("Account Holder Name: " + account.getHolderName());
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Account Type: " + account.getAccountType());
                System.out.println("Your Balance: " + account.getBalance());

            }else{
                System.out.println("no account with this accountNumber");
            }
        }
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        for(Account account: accounts){
            if(accountNumber.equals(account.getAccountNumber())){

                if(amount > 0){
                    account.deposit(amount);
                    System.out.println("Deposit successfully");
                }else{
                    System.out.println("Amount should be more than 0");
                }

            }else{
                System.out.println("no account with this accountNumber");
            }
        }
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        for(Account account: accounts){
            if(accountNumber.equals(account.getAccountNumber())){

                if(amount > account.getBalance()){
                    System.out.println("Amount is greater than current balance. Your current balance: " + account.getBalance());
                }
                account.withdraw(amount);
                System.out.println("Withdraw successfully");

            }else{
                System.out.println("no account with this accountNumber");
            }
        }
    }

    @Override
    public void statement(String accountNumber) {
        for(Account account: accounts){
            if(accountNumber.equals(account.getAccountNumber())){
                account.displayBankTransactions();
            }else{
                System.out.println("no account with this accountNumber");
            }
        }
    }
}
