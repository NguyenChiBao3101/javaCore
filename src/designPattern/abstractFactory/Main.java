package designPattern.abstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Bank from where you want to take loan amount :");
        String bankName = sc.nextLine();
        System.out.println("Enter loan's type (home, business or education): ");
        String loanName = sc.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for " + b.getBank() + " :");
        double rate = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the loan amount  you want to take : ");
        double loanAmount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the number of years to pay your entice laon amount  ");
        int years = sc.nextInt();
        sc.nextLine();
        System.out.println("you are taking the loan from " + b.getBank());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);

    }
}
