package miniBank;

public class Transactions {

    protected String transactionID;
    protected Savings savings;
    protected Current current;

    public Transactions(Savings savings, Current current) {
        this.savings = savings;
        this.current = current;
    }

    public Savings getSavings() {
        return savings;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String generateTransactionID() {
        String txID = "TXN-" + System.currentTimeMillis();
        return txID;
    }

    public void sortWithdrawals(int tier) {
        switch (tier) {
            case 1:
                savings.setWidthrawalLimit(2_000);
                break;
            case 2:
                savings.setWidthrawalLimit(4_000);
                break;
            case 3:
                savings.setWidthrawalLimit(5_000);
                break;
            default:
                savings.setWidthrawalLimit(10_000);
        }
    }

    public void sortDeposit(int tier) {
        switch (tier) {
            case 1:
                savings.setDepositLimit(2_000);
                break;
            case 2:
                savings.setDepositLimit(4_000);
                break;
            case 3:
                savings.setDepositLimit(5_000);
                break;
            default:
                savings.setDepositLimit(10_000);
        }
    }

    public void withdraw(double withdrawalAmount) {
        savings.withdraw();
        int tier = savings.getAccountTier();
        System.out.println("Account tier " + tier);
        sortWithdrawals(tier);
        int limit = savings.getWidthrawalLimit();
        System.err.println("Your withdrawal limit " + limit);
        boolean isOnHold = savings.isOnHold();
        String acctStatus = savings.getAccountStatus();

        if (isOnHold && acctStatus.equalsIgnoreCase(acctStatus)) {
            System.out.println("Account is on hold. Withdrawal denied. Please contact your bank");
            return;
        }

        if (savings.accountBalance < withdrawalAmount) {
            System.out.println("Insufficient funds. Withdrawal denied.");
            return;
        }

        if (withdrawalAmount > limit) {
            System.out.println("Withdrawal amount exceeds the limit. Withdrawal denied.");
        } else {
            savings.accountBalance -= withdrawalAmount;
            savings.setTransactionType("Debit");
            savings.setWithdrawalType("Bank Transfer");
            setTransactionID(generateTransactionID());
            System.out.println("Withdrawal successful. New balance for: " + savings.accountNumber + " = " + savings.accountBalance + " TXID " + getTransactionID());
        }
    }

    public void depositLoan(double loanAmount) {
        savings.deposit();
        int tier = savings.getDepositLimit();
        sortDeposit(tier);

        if (savings.depositLimit < loanAmount) {
            System.out.println("Deposit amount exceeds the limit. Deposit allowed but account on hold.");
            setTransactionID(generateTransactionID());
            savings.setTransactionType("Credit");
            savings.setWithdrawalType("Lon Credit");
            savings.setAccountStatus("On Hold");
            savings.setOnHold(true);
            return;
        }

        savings.accountBalance += loanAmount;
        savings.setTransactionType("Credit");
        savings.setWithdrawalType("Lon Credit");
        setTransactionID(generateTransactionID());
        System.out.printf(
                "Loan has been approved in your account. New balance for %s = $%,.2f | TXNID: %s%n",
                savings.accountNumber,
                savings.accountBalance,
                getTransactionID()
        );
        double totalRepayment = savingsLoan(loanAmount);
        System.out.println("Total repayment amount with interest: " + totalRepayment);
    }

    public void deposit(double depositAmount) {
        savings.deposit();
        int tier = savings.getAccountTier();
        sortDeposit(tier);

        if (savings.depositLimit < depositAmount) {
            setTransactionID(generateTransactionID());
            savings.setAccountStatus("On Hold");
            savings.setOnHold(true);
            System.out.println("Deposit amount exceeds the limit. Deposit allowed but account on hold. TXID: " + getTransactionID());
            return;
        }

        savings.accountBalance += depositAmount;
        savings.setTransactionType("Credit");
        savings.setWithdrawalType("Bank Transfer");
        setTransactionID(generateTransactionID());
        System.out.println("Deposit successful. New balance for: " + savings.accountNumber + " = " + savings.accountBalance + " TXID " + getTransactionID());

    }

    public double savingsLoan(double loanAmount) {
        double interestRate = 0.10;
        double totalRepayment = loanAmount + (loanAmount * interestRate);
        return totalRepayment;
    }

    public Current getCurrent() {
        return current;
    }

    public void withdrawCurrent(double amount) {
        current.overDraft();

        if (current.accountBalance + current.overDraftLimit < amount) {
            double remAmount = (current.accountBalance + current.overDraftLimit) - amount;
            double iRate = interest(remAmount);
            setTransactionID(generateTransactionID());
            current.setTransactionType("Debit");
            current.setWithdrawalType("ATM Widthrawal");
            current.setOwing(true);

            System.out.printf(
                    "Withdrawal exceeded overdraft limit — allowing withdrawal with interest applied.%n"
                    + "New balance for %s = $%,.2f | TXNID: %s%n",
                    current.accountNumber,
                    current.accountBalance + iRate,
                    getTransactionID()
            );
            return;
        }

        current.accountBalance -= amount;
        current.setTransactionType("Debit");
        current.setWithdrawalType("POS Widthrawal");
        setTransactionID(generateTransactionID());
        System.out.println("Withdrawal successful. New balance for: " + current.accountNumber + " = " + current.accountBalance);
    }

    public void depositCurrent(double amount) {
        boolean isOwing = current.isOwing();

        if (isOwing) {
            current.accountBalance = current.accountBalance - amount;
            current.setOwing(false);
            setTransactionID(generateTransactionID());
            System.out.printf(
                    "Deposit received. Overdraft paid. Account %s | New Balance: $%,.2f | TXNID: %s%n",
                    current.accountNumber,
                    current.accountBalance,
                    getTransactionID()
            );
        } else {
            current.accountBalance += amount;
            setTransactionID(generateTransactionID());
            current.setTransactionType("Credit");
            current.setDepositType("Cash Deposit");
            System.out.printf(
                    "Deposit successful. New balance for %s = $%,.2f | Overdraft: $%d | TXID: %s%n",
                    current.accountNumber,
                    current.accountBalance,
                    current.getOverDraftLimit(),
                    getTransactionID()
            );
        }

    }

    public double interest(double remAmount) {
        double interestRate = 0.05;
        double interestAmount = remAmount + (remAmount * interestRate);
        return interestAmount;
    }

}
