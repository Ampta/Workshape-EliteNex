package day_6;

import java.util.Date;

public class BankAccountTransaction {

    BankTransactionType bankTransactionType;
    Date transactionDate;
    double amount;

    public BankAccountTransaction(BankTransactionType bankTransactionType, Date transactionDate, double amount) {
        this.bankTransactionType = bankTransactionType;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

    public BankTransactionType getBankTransactionType() {
        return bankTransactionType;
    }

    public void setBankTransactionType(BankTransactionType bankTransactionType) {
        this.bankTransactionType = bankTransactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccountTransaction{" +
                "bankTransactionType=" + bankTransactionType +
                ", transactionDate=" + transactionDate +
                ", amount=" + amount +
                '}';
    }


}
