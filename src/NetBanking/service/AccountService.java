package NetBanking.service;

import NetBanking.dao.AccountDao;
import NetBanking.model.Account;
import NetBanking.model.Branch;
import NetBanking.model.Customer;

import java.sql.SQLException;

public class AccountService {
    AccountDao accountDao = new AccountDao();

    public Account createNewAccount(Customer customer, Branch branch) throws SQLException {
        return accountDao.createAccount(customer.getId(), branch.getId());
    }

}
