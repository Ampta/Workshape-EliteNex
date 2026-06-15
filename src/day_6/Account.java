package day_6;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int accountId;
    private String bankName;
    private String accountNumber;
    private String holderName;
    private AccountType accountType;
    private double balance;
    private final ArrayList<BankAccountTransaction> bankAccountTransactions=new ArrayList<>();

    public void deposit(double amount){
        balance += amount;
        bankAccountTransactions.add(new BankAccountTransaction(BankTransactionType.DEPOSIT,new Date(), amount ));
    }

    public void withdraw(double amount){
        balance -= amount;
        bankAccountTransactions.add(new BankAccountTransaction(BankTransactionType.WITHDRAW,new Date(), amount ));
    }

    public void displayBankTransactions(){
        System.out.println("  == Your full transaction history ==");
        for(BankAccountTransaction statement : bankAccountTransactions){
            System.out.println(" |" + statement.getBankTransactionType() + " | " + statement.getTransactionDate() + " | " + statement.getAmount() + "|");
        }
    }


    public Account(int accountId, String bankName, String accountNumber, String holderName, AccountType accountType, double balance) {
        this.accountId = accountId;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", accountType=" + accountType +
                ", balance=" + balance +
                '}';
    }
}
