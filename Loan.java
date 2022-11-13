import java.util.*;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Loan loanObj = new Loan();
            System.out.print("Enter Loan amount : ");
            loanObj.setLoanAmount(scanner.nextDouble());

            System.out.print("Enter annual interest rate : ");
            loanObj.setAnnualInterestRate(scanner.nextDouble());

            System.out.print("Enter number of years : ");
            loanObj.setNumberOfYears(scanner.nextInt());
        }

        catch (IllegalArgumentException ex) {
            System.out.println("Loan Amount or interest rate or number of years is less than zero." + ex.getMessage());
        }

    }

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan() {
        this(3.0, 5, 100);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (loanAmount <= 0)
            throw new IllegalArgumentException();

        if (annualInterestRate <= 0)
            throw new IllegalArgumentException();

        if (numberOfYears <= 0)
            throw new IllegalArgumentException();

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException();
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0)
            throw new IllegalArgumentException();
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0)
            throw new IllegalArgumentException();
        this.loanAmount = loanAmount;
    }
}