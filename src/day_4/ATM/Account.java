package day_4.ATM;

public class Account {
    double balance = 50000;

    public Account(){}

    public Account(double balance){
        this.balance = balance;
    }

    void deposit(double amount){
        balance = balance + amount;
    };

    void withdraw(double amount){
        balance = balance - amount;
    };

}
