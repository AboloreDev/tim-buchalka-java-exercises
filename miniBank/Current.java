package miniBank;

public class Current extends Account {

    protected String withdrawalType;
    protected int overDraftLimit;
    protected String depositType;
    protected String transactionType;
    private boolean isOwing;

    public Current(String accountNumber, double accountBalance, int overDraftLimit) {
        super(accountNumber, accountBalance);
        this.overDraftLimit = overDraftLimit;
    }

    public void overDraft() {
        System.out.println("Overdraft is progress");
    }

    public String getWithdrawalType() {
        return withdrawalType;
    }

    public void setWithdrawalType(String withdrawalType) {
        this.withdrawalType = withdrawalType;
    }

    public int getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(int overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public boolean isOwing() {
        return isOwing;
    }

    public void setOwing(boolean isOwing) {
        this.isOwing = isOwing;
    }

}
