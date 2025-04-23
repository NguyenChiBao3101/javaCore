package designPattern.builder.example1;

public class SamSung  extends Company{

    @Override
    public String pack() {
        return "SamSung CD";
    }

    @Override
    public int price() {
        return 30;
    }
}
