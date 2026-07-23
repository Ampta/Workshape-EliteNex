package NetBanking.dao;

import NetBanking.config.DbConnect;
import NetBanking.model.Customer;
import NetBanking.model.enums.Role;
import NetBanking.util.GenerateId;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    public Customer registerCustomer(String name, String email, String password) throws SQLException {
        String query = """
                insert into customers (id, name, email, password, role) values (?, ?, ?, ?,'USER')
                """;
        try (Connection con = DbConnect.getConn();
             PreparedStatement statement = con.prepareStatement(query)
        ) {
            String id = GenerateId.generateCustomerId();
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, email);
            statement.setString(4, password);

            statement.executeUpdate();

            Customer customer = findById(id);
            if (customer == null) {
                throw new SQLException("Failed to find Customer");
            }
            return customer;
        }
    }

    public Customer findByEmailAndPassword(String email, String password) throws SQLException{
        String query = "select * from customers where email = ? and password = ?";
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query);
        ){
            statement.setString(1, email);
            statement.setString(2, password);

            try(ResultSet result = statement.executeQuery()){
                return result.next() ? map(result) : null;
            }
        }
    }

    public List<Customer> findAll() throws SQLException{
        String query = "select * from customers where role = 'USER' order by created_at desc";
        List<Customer> customers = new ArrayList<>();
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet result = statement.executeQuery();
        ){
            while(result.next()){
                customers.add(map(result));
            }
        }
        return customers;
    }

    public Customer findById(String id) throws SQLException{
        String query = "select * from customers where id = ?";
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query)){
            statement.setString(1, id);
            try(ResultSet result = statement.executeQuery()){
                return result.next() ? map(result) : null;
            }
        }
    }



    private Customer map(ResultSet result) throws SQLException {
        Timestamp createdAt = result.getTimestamp("created_At");

        return new Customer(
                result.getString("id"),
                result.getString("name"),
                result.getString("email"),
                result.getString("password"),
                Role.valueOf(result.getString("role")),
                createdAt.toLocalDateTime()
        );
    }
}
