package NetBanking.util;

import java.util.Random;

public class GenerateId {

    static String baseCustomer = "C26";
    static String baseBranch = "B";
    static String baseAccount = "ACC2026";
    static String baseTransaction = "TRAN";
    static Random random = new Random();

    public static String generateCustomerId(){
        return baseCustomer + random.nextInt(99);
    }

    public static String generateBranchId(){
        return baseBranch + random.nextInt(10);
    }

    public static String generateAccountId(){
        return baseAccount + random.nextInt(999);
    }

    public static String generateTransactionId(){
        return baseTransaction + random.nextInt(9999);
    }
}
