package designPattern.abstractFactory;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        if(bankName == null) {
            return null;
        } else if(bankName.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else if(bankName.equalsIgnoreCase("ICICI")) {
            return new ICICI();
        }else if(bankName.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
