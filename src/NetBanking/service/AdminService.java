package NetBanking.service;

import NetBanking.dao.BranchDao;
import NetBanking.dao.CustomerDao;
import NetBanking.model.Branch;
import NetBanking.model.Customer;

import java.sql.SQLException;
import java.util.List;

public class AdminService {
    private CustomerDao customerDao = new CustomerDao();
    private BranchDao branchDao = new BranchDao();

    public List<Customer> findAllUsers() throws SQLException {
        return customerDao.findAll();
    }

    public List<Branch> findAllBranches() throws SQLException {
        return branchDao.findAll();
    }
}
