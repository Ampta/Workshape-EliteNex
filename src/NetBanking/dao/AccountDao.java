package NetBanking.dao;

import NetBanking.config.DbConnect;
import NetBanking.model.Account;
import NetBanking.model.Transaction;
import NetBanking.util.GenerateId;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
    public Account createAccount(String customerId, String branchId) throws SQLException {
        String query = """
                insert into accounts (customer_id, branch_id, account_number) values (?, ?, ?)
                """;
        try (Connection con = DbConnect.getConn();
             PreparedStatement statement = con.prepareStatement(query)
        ) {
            String accountNumber = GenerateId.generateAccountId();
            statement.setString(1, customerId);
            statement.setString(2, branchId);
            statement.setString(3, accountNumber);

            statement.executeUpdate();

            Account account = findByAccountNumber(accountNumber);
            if (account == null) {
                throw new SQLException("Failed to find Customer");
            }
            return account;
        }
    }

    public Account deposit(Account account, double amount){

        return null;
    }

    public Account withdraw(Account account, double amount){

        return null;
    }

    public Account transfer(Account fromAccount, Account toAccount, double amount){

        return null;
    }

    public List<Account> findAll() throws SQLException{
        String query = "select * from customers where role = 'USER' order by created_at desc";
        List<Account> accounts = new ArrayList<>();
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet result = statement.executeQuery();
        ){
            while(result.next()){
                accounts.add(map(result));
            }
        }
        return accounts;
    }

    public Account findByAccountNumber(String accountNumber) throws SQLException{
        String query = "select * from accounts where account_number = ?";
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query)){
            statement.setString(1, accountNumber);
            try(ResultSet result = statement.executeQuery()){
                return result.next() ? map(result) : null;
            }
        }
    }

    private Account map(ResultSet result) throws SQLException {
        Timestamp createdAt = result.getTimestamp("created_At");

        return new Account(
                result.getString("id"),
                result.getString("customer_id"),
                result.getString("branch_id"),
                result.getString("account_number"),
                result.getDouble("balance"),
                createdAt.toLocalDateTime()
        );
    }
}
