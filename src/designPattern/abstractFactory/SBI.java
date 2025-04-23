package designPattern.abstractFactory;

public class SBI  implements Bank{
    private final String name;

    public SBI() {
        name = "SBI BANK";
    }


    @Override
    public String getBank() {
        return name;
    }
}
