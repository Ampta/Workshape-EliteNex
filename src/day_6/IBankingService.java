package day_6;

public interface IBankingService {
    void createAccount(String holderName, AccountType accountType, double initialBalance);
    void working();
    void showDetails(String accountNumber);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    void statement(String accountNumber);
}
