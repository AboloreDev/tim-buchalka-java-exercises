package miniBank;

public class Savings extends Account {

    protected String withdrawalType;
    protected int widthrawalLimit;
    protected int depositLimit;
    protected String depositType;
    private int accountTier;
    private String accountStatus;
    private boolean isOnHold;
    private String transactionType;

    public Savings(String accountNumber, double accountBalance, int accountTier) {
        super(accountNumber, accountBalance);
        this.accountTier = accountTier;
    }

    public void withdraw() {
        System.out.println("Withdrawal is progress");
    }

    public void deposit() {
        System.out.println("Deposit is progress");
    }

    public String getWithdrawalType() {
        return withdrawalType;
    }

    public int getWidthrawalLimit() {
        return widthrawalLimit;
    }

    public int getDepositLimit() {
        return depositLimit;
    }

    public String getDepositType() {
        return depositType;
    }

    public int getAccountTier() {
        return accountTier;
    }

    public void setWithdrawalType(String withdrawalType) {
        this.withdrawalType = withdrawalType;
    }

    public void setWidthrawalLimit(int widthrawalLimit) {
        this.widthrawalLimit = widthrawalLimit;
    }

    public void setDepositLimit(int depositLimit) {
        this.depositLimit = depositLimit;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public void setAccountTier(int accountTier) {
        this.accountTier = accountTier;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public boolean isOnHold() {
        return isOnHold;
    }

    public void setOnHold(boolean isOnHold) {
        this.isOnHold = isOnHold;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

}
