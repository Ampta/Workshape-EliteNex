package NetBanking.service;

import NetBanking.dao.AccountDao;
import NetBanking.model.Account;

import java.sql.SQLException;

public class AccountService {
    AccountDao accountDao = new AccountDao();

    public Account createNewAccount(String customerId, String branchId) throws SQLException {
        return accountDao.createAccount(customerId, branchId);
    }

}
