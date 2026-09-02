package miniBank;

public class Main {

    public static void main(String[] args) {

        String acctNumber = "ACC-1234";
        double acctBalance = 0.0;
        // Create a Savings account
        Savings savingsAccount = new Savings(acctNumber, acctBalance, 4);

        // Create a Current account
        Current currentAccount = new Current(acctNumber, acctBalance, 1000);

        // Create Transactions object
        Transactions transactions = new Transactions(savingsAccount, currentAccount);

        // Create a Customer with the Savings account and Transactions
        Customer customer = new Customer("Fathiu", savingsAccount, transactions);

        // Perform some transactions
        customer.performOpertions();
    }
}
