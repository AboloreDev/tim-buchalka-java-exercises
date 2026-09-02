package miniBank;

public class Customer {

    private String name;
    private Account account;
    private Transactions transactions;

    public Customer(String name, Account account, Transactions transactions) {
        this.name = name;
        this.account = account;
        this.transactions = transactions;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public Account geAtccount() {
        return account;
    }

    public void performOpertions() {
        System.out.println("Performing banking operations");
        double balance = account.getAccountBalance();
        String accountNumber = account.getAccountNumber();

        System.out.println("----------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Account Balance: $%,.2f%n", balance);
        System.out.println("----------------------------------------");

        // transactions.withdraw(amount);
        transactions.deposit(10_000);
        transactions.withdraw(9_000);
        transactions.withdrawCurrent(20_000);
        transactions.depositCurrent(1_000);
        System.out.println("Operations done");
    }
}
