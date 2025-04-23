package collection.list.management;

public class Student {
    private String id;
    private String name;
    private int dateOfBirth;
    private double score;


    public Student(String id, String name, int dateOfBirth, double score) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public Student setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public double getScore() {
        return score;
    }

    public Student setScore(double score) {
        this.score = score;
        return this;
    }

    public Student setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", score=" + score +
                '}';
    }
}
