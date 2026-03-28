package bank.entity;

public class User {
    private String username;
    private String password;
    private String contactnumber;
    private String role;
    private Double accountbalance;

    public User(String username, String password, String contactnumber, String role, Double accountbalance)
    {
        this.username = username;
        this.password = password;
        this.contactnumber = contactnumber;
        this.role = role;
        this.accountbalance = accountbalance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(Double accountbalance) {
        this.accountbalance = accountbalance;
    }
}
