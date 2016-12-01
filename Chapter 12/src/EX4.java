/**
 * Created by Julius on 18-09-2016.
 */
public class EX4 {
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private java.util.Date loanDate;

                /** Default constructor */
                public EX4() {
                    this(2.5, 1, 1000);
             }

        /** Construct a loan with specified annual interest rate,
         no-arg constructor
         10.2 Class Abstraction and Encapsulation 369
         13 number of years, and loan amount
         14 */
            public EX4(double annualInterestRate, int numberOfYears, double loanAmount) {
                if(annualInterestRate <= 0){
                    throw new IllegalArgumentException("Greater than 0!");
                }
                if(numberOfYears <= 0){
                    throw new IllegalArgumentException("Greater than 0!");
                }
                if(loanAmount <= 0){
                    throw new IllegalArgumentException("Greater than 0!");
                }
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();
            }
                /** Return annualInterestRate */
                public double getAnnualInterestRate() {
            return annualInterestRate;
            }
                /** Set a new annualInterestRate */
                public void setAnnualInterestRate(double annualInterestRate) {
                    if(annualInterestRate <= 0){ throw new IllegalArgumentException("Greater than 0!"); }
                    this.annualInterestRate = annualInterestRate;
            }
                /** Return numberOfYears */
                public int getNumberOfYears() {
                    return numberOfYears;
            }
                /** Set a new numberOfYears */
                public void setNumberOfYears(int numberOfYears) {
                    if(numberOfYears <= 0){ throw new IllegalArgumentException("Greater than 0!"); }
                    this.numberOfYears = numberOfYears;
            }
                /** Return loanAmount */
                public double getLoanAmount() {
                    return loanAmount;
            }
                /** Set a new loanAmount */
                public void setLoanAmount(double loanAmount) {
                    if(loanAmount <= 0){ throw new IllegalArgumentException("Greater than 0!"); }
                    this.loanAmount = loanAmount;
            }

                /** Find monthly payment */
                public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                    (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;
            }
                /** Find total payment */
                public double getTotalPayment() {
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
            }
                /** Return loan date */
                public java.util.Date getLoanDate() {
            return loanDate;
            }
        }
