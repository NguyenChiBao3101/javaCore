package designPattern.abstractFactory;

public class BusinessLoan extends Loan{
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
