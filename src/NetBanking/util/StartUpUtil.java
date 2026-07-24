package NetBanking.util;

import NetBanking.dao.CustomerDao;
import NetBanking.model.Account;
import NetBanking.model.Branch;
import NetBanking.model.Customer;
import NetBanking.model.enums.Role;
import NetBanking.service.AccountService;
import NetBanking.service.AdminService;
import NetBanking.service.AuthService;
import NetBanking.service.BranchService;

import java.sql.SQLException;
import java.util.Scanner;

public class StartUpUtil {

    private Scanner scanner = new Scanner(System.in);
    private CustomerDao customerDao = new CustomerDao();
    private AuthService authService = new AuthService(customerDao);
    private AdminService adminService = new AdminService();
    private BranchService branchService = new BranchService();
    private AccountService accountService = new AccountService();

    public void start(){

        while(true){
            System.out.println("\n Welcome to banking system");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");
            int choice = readInt("Choose: ");
            try{
                switch (choice){
                    case 1 -> registerCustomer();
                    case 2 -> loginCustomer();
                    case 0 -> {
                        System.out.println("Thank YOU for using our application");
                        return;
                    }
                    default -> System.out.println("Invalid Option");
                }
            }catch (Exception exception){
                System.out.println("Error: " + exception.getMessage());
            }
        }
    }

    private void registerCustomer() throws SQLException {
        // create customer
        Customer customer = authService.registerCustomer(
                readLine("Name: "),
                readLine("Email: "),
                readLine("Password: ")
        );

        System.out.println(customer.getId());

        // select branch
        System.out.println("Select Branch from below Options");
        branchService.printAllBranch();
        Branch branch = branchService.selectBranch(
                customer,
                readInt("Select: "));

        System.out.println(branch.getId());

        // create account
        Account account = accountService.createNewAccount(customer, branch);
        System.out.println(" Welcome " + customer.getName().toUpperCase() + ". Your Account Number is: " + account.getAccountNumber());
    }

    private void loginCustomer() throws SQLException{
        Customer customer = authService.loginCustomer(
                readLine("Enter Email: "),
                readLine("Enter Password: ")
        );

        if(customer == null){
            System.out.println("User is not registered");
            return;
        }

        branchService.printAllBranch();

        if(customer.getRole().equals(Role.ADMIN)){
            adminMenu(customer);
        }else{
            customerMenu(customer);
        }
    }


    private void customerMenu(Customer customer){
        while(true) {
            System.out.println("\n Welcome " + customer.getName());
            System.out.println("Your Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. My Profile");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("0. Logout");
            int choice = readInt("Choose: ");
            try {
                switch (choice) {
                    case 1 -> System.out.println("Deposit");
                    case 2 -> System.out.println("Withdraw");
                    case 3 -> System.out.println("My Profile");
                    case 4 -> System.out.println("Check Balance");
                    case 5 -> System.out.println("History");
                    case 0 -> {
                        System.out.println("You Logout successfully");
                        return;
                    }
                    default -> System.out.println("Invalid Option");
                }
            } catch (Exception exception) {
                System.out.println("Error: " + exception.getMessage());
            }
        }
    }

    private void adminMenu(Customer customer) throws SQLException {
        System.out.println("admin menu");
        if(customer.getRole().equals(Role.ADMIN)){
            for(Branch existingCustomer: adminService.findAllBranches()){
                System.out.println(existingCustomer);
            }
        }

    }


    private String readLine(String label){
        System.out.print(label);
        return scanner.nextLine();
    }

    private int readInt(String label){
        return Integer.parseInt(readLine(label));
    }
}
