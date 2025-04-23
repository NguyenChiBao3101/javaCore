package designPattern.abstractFactory;

public class LoanFactory  extends AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan == null ) {
            return null;
        } else if(loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")) {
            return new BusinessLoan();
        } else if(loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }
        return null;
    }
}
