package NetBanking.model;

import java.time.LocalDateTime;

public class Branch {
    private String id;
    private String ifscCode;
    private String address;
    private LocalDateTime createdAt;

    public Branch(String id, String ifscCode, String address, LocalDateTime createdAt) {
        this.id = id;
        this.ifscCode = ifscCode;
        this.address = address;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id='" + id + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", address='" + address + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
