package collection.set.candidates;

public class Candidate {
    private int id;
    private String name;
    private String address;
    private int priority;

    public Candidate (int id, String name, String address, int priority ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public void setId( int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Candidate setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }
    public Candidate setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getPriority() {
        return priority;
    }
    public Candidate setPriority(int priority) {
        this.priority = priority;
        return this;
    }
}
