package designPattern.abstractFactory;

public class ICICI implements Bank {
    private final String name;

    public ICICI() {
        name = "ICICI BANK";
    }

    @Override
    public String getBank() {
        return name;
    }
}
