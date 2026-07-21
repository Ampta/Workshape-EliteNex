package NetBanking.model;

import NetBanking.model.enums.Role;

import java.time.LocalDateTime;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String password_hash;
    private Role role;
    private LocalDateTime createdAt;
}
