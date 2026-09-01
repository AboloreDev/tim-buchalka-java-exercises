package account;

public class Main {

    public static void main(String[] args) {
        // double amount = 30_000.0;
        // String accountNumber = "ACC-2001";
        // double accountBalance = 200_000.0;
        // String customerName = "John Doe";
        // String customerEmail = "test@gmail.com";
        // String phoneNumber = "123456789";

        // Account bankAccount = new Account(accountNumber, accountBalance, customerName, customerEmail, phoneNumber);
        // System.out.println(bankAccount.deposit(amount));
        // System.out.println(bankAccount.withdraw(amount));
        Customer customer = new Customer();
        Customer secondCustomer = new Customer("Jane West", 1000, "test@west.com");
        Customer thirdCustomer = new Customer("Jane West", "test@west.com");

        System.out.println("Get Name " + customer.getName());
        System.out.println("Get Credit limit " + customer.getCreditLimit());
        System.out.println("Get EMail " + customer.getEmail());

        System.out.println("Get Name " + secondCustomer.getName());
        System.out.println("Get Credit limit " + secondCustomer.getCreditLimit());
        System.out.println("Get EMail " + secondCustomer.getEmail());

        System.out.println("Get Name " + thirdCustomer.getName());
        System.out.println("Get Credit limit " + thirdCustomer.getCreditLimit());
        System.out.println("Get EMail " + thirdCustomer.getEmail());

    }
}
