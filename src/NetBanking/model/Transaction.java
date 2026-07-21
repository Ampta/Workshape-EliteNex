package NetBanking.model;

import NetBanking.model.enums.TransactionStatus;
import NetBanking.model.enums.TransactionType;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String fromAccountId;
    private String toAccountId;
    private double amount;
    private double afterBalance;
    private TransactionType type;
    private TransactionStatus status;
    private LocalDateTime createdAt;
}
