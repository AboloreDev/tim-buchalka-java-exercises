package account;

public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public Account(String accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String withdraw(double amount) {
        if (amount > accountBalance) {
            return "Insufficient funds";
        }
        return "Account " + accountNumber + " balance after withdrawal is " + (accountBalance - amount);
    }

    public String deposit(double amount) {
        return "Account " + accountNumber + " balance after deposit is " + (accountBalance + amount);
    }

}
