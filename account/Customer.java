package account;

public class Customer {

    // Fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Constructors
    public Customer() {
        this("John Doe", "test@gmail.com");
        System.out.println("Calling empty constructor");
    }

    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
        System.out.println("Calling constructor with two values");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Calling constructor with all three fields");
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return emailAddress;
    }
}
