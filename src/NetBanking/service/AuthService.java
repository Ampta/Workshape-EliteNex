package NetBanking.service;

import NetBanking.dao.CustomerDao;
import NetBanking.model.Customer;

import java.sql.SQLException;

public class AuthService {

    private CustomerDao customerDao = new CustomerDao();

    public AuthService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Customer registerCustomer(String name, String email, String password) throws SQLException {
        return customerDao.registerCustomer(name, email, password);
    }

    public Customer loginCustomer(String email, String password) throws SQLException{
        return customerDao.findByEmailAndPassword(email, password);
    }

    // forget password

}
