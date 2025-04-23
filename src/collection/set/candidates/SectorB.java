package collection.set.candidates;

public class SectorB extends Candidate{
    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public SectorB(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "SectorB{" +
                "\nId : " + getId() +
                "\nName : " + getName() +
                "\nAddress : " + getAddress() +
                "\n Priority : " + getPriority() +
                "\nSubjects : " + MON_TOAN + ", " + MON_HOA + ", " + MON_SINH +
                "\n" + "} ";
    }
}
