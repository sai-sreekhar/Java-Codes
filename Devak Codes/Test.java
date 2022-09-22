import java.util.*;

class Account {
    private int accountNumber;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int accountNumber, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance = getBalance() - amount;
    }

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    @Override
    public String toString() {
        return "accountNumber= " + accountNumber + ", balance= " + balance
                + ", annualInterestRate= " + annualInterestRate
                + ", dateCreated= " + dateCreated;
    }

}

class Checking extends Account {
    private double overDraft;

    public Checking(int accountNumber, double balance, double overDraft) {
        super(accountNumber, balance);
        this.overDraft = overDraft;
    }

    public void withdraw(double amount) {
        if ((getBalance() - amount) < overDraft) {
            System.out.println("Exceded limit.Could not Withdraw");
        } else
            super.setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {

        return super.toString() + " CheckingoverDraft= " + overDraft + "";
    }

}

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount > 0) {
            super.setBalance(getBalance() - amount);
        } else {
            System.out.println("Account Do not have enough balance");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "";
    }

}

public class Test {

    public static void main(String[] args) {

        Checking checkingObj = new Checking(2574, 100000, -1000);
        System.out.println("Account Info: " + checkingObj.toString());
        System.out.println("Account balance before withdrawl: " + checkingObj.getBalance());
        System.out.println("Performing Withdrawl of 100000");
        checkingObj.withdraw(100000);
        System.out.println("Account balance after withdrawl: " + checkingObj.getBalance());
        System.out.println("Performing Withdrawl of 1000");
        checkingObj.withdraw(1000);
        System.out.println("Checking Account balance after withdrawl: " + checkingObj.getBalance());
        System.out.println("Performing Withdrawl of 1000");
        checkingObj.withdraw(1000);
        System.out.println("Account balance: " + checkingObj.getBalance());
        SavingsAccount savingsObj = new SavingsAccount(4571, 50000);
        System.out.println("Savings Account Account Info: " + savingsObj.toString());
        System.out.println("Savings Account Account balance before withdrawl: " + savingsObj.getBalance());
        System.out.println("Performing Withdrawl of 10000");
        savingsObj.withdraw(10000);
        System.out.println("Savings Account Account balance before withdrawl:" + savingsObj.getBalance());
        System.out.println("Performing Withdrawl of 50000");
        savingsObj.withdraw(50000);
        System.out.println("Savings Account Account balance:" + savingsObj.getBalance());
    }

}