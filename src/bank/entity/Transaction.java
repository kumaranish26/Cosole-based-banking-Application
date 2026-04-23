package bank.entity;

import java.time.LocalDate;

public class Transaction {
    private LocalDate transactionDate;
    private String transactionUserId;
    private Double transactionAmount;
    private String transactionType;
    private String initialBalance;
    private String finalBalance;
    private String transactionPerformedBy;


    public Transaction(LocalDate transactionDate, String transactionUserId, Double transactionAmount, String transactionType, String initialBalance, String finalBalance, String transactionPerformedBy) {
        this.transactionDate = transactionDate;
        this.transactionUserId = transactionUserId;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
        this.transactionPerformedBy = transactionPerformedBy;
    }
    public boolean checkIssue(User user) {

    }

    public String getTransactionPerformedBy() {
        return transactionPerformedBy;
    }

    public void setTransactionPerformedBy(String transactionPerformedBy) {
        this.transactionPerformedBy = transactionPerformedBy;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionUserId() {
        return transactionUserId;
    }

    public void setTransactionUserId(String transactionUserId) {
        this.transactionUserId = transactionUserId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(String initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(String finalBalance) {
        this.finalBalance = finalBalance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionDate=" + transactionDate +
                ", transactionUserId='" + transactionUserId + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", transactionType='" + transactionType + '\'' +
                ", initialBalance='" + initialBalance + '\'' +
                ", finalBalance='" + finalBalance + '\'' +
                ", transactionPerformedBy='" + transactionPerformedBy + '\'' +
                '}';
    }
}
