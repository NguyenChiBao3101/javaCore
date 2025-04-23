package collection.set.candidates;

public class SectorC extends Candidate{
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public SectorC(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }
    @Override
    public String toString() {
        return "SectorC{" +
                "\nId : " + getId() +
                "\nName : " + getName() +
                "\nAddress : " + getAddress() +
                "\n Priority : " + getPriority() +
                "\nSubjects : " + MON_VAN + ", " + MON_SU + ", " + MON_DIA +
                "\n" + "} ";
    }
}
