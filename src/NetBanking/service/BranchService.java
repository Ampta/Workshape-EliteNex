package NetBanking.service;

import NetBanking.dao.BranchDao;
import NetBanking.model.Branch;
import NetBanking.model.Customer;

import java.sql.SQLException;
import java.util.List;

public class BranchService {
    private BranchDao branchDao = new BranchDao();

    public void printAllBranch() throws SQLException {
        List<Branch> branches = branchDao.findAll();
        int size = branches.size();

        int count = 1;
        for(int i = 0; i<size; i++){
            System.out.printf("%d. %s", count++, branches.get(i).getAddress());
            System.out.println();
        }
    }

    public Branch selectBranch(Customer customer, int index) throws SQLException {
        return branchDao.selectBranch(index);
    }


}
