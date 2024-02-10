package org.example;

public class Loan {
    public static void main(String[] args) {
    loanParameters(500000,(short)360,7);
    }
    public static void loanParameters (int sumOfLoan, short monthsOfLoan,double interest) {
        double monthlyPayment = (double) sumOfLoan /monthsOfLoan;
        double monthlyInterest = interest/100/12.00f;
        double totalRepayment = sumOfLoan+sumOfLoan*monthlyInterest*monthsOfLoan;
        double annualPayback = totalRepayment/monthsOfLoan*12;
        double monthlyPaymentWithInterest = annualPayback/12;
        System.out.println("Monthly payment with NO interest = " +monthlyPayment);
        System.out.println("Monthly payment with interest = " +monthlyPaymentWithInterest);
        System.out.println("Total amount to be paid back to the bank = " + totalRepayment);

    }




}
