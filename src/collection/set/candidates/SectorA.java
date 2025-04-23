package collection.set.candidates;

public class SectorA extends Candidate {

    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    
    public SectorA(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "SectorA{" +
                "\nId : " + getId() +
                "\nName : " + getName() +
                "\nAddress : " + getAddress() +
                "\nPriority : " + getPriority() +
                "\nSubjects : " + MON_TOAN + ", " + MON_LY + ", " + MON_HOA +
                "\n" + "} ";
    }
}
