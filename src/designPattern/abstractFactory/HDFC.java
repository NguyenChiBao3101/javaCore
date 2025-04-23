package designPattern.abstractFactory;

public class HDFC implements Bank{
    private final String name;

    public HDFC() {
        name = "HDFC BANK";
    }
    @Override
    public String getBank() {
        return name;
    }
}
