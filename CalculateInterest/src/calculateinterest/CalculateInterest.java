package calculateinterest;

import java.util.Scanner;

public class CalculateInterest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter annual interest rate like as 15% ");
        double annualInterest = s.nextDouble();

        double monthlyInterestRate = annualInterest / 1200;

        System.out.println("Enter Number of Year ");
        int numberOfYear = s.nextInt();

        System.out.println("Enter Loan Amount ");
        double loanAmount = s.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12));

        double totalPayment = monthlyPayment * numberOfYear * 12;

        System.out.println("Monthly Payment $" + (int) monthlyPayment);
        System.out.println("Total Payment $" + (int) totalPayment);
    }
}
