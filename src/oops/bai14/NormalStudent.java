package oops.bai14;

public class NormalStudent extends Student{
    private float engScore, entryScore;

    public NormalStudent() {
        super();
        engScore = 0;
        entryScore = 0;
    }

    public NormalStudent(String fullName, String DOB, String sex, String phoneNumber, String universityName, int gradeLevel, float engScore, float entryScore) {
        super(fullName, DOB, sex, phoneNumber, universityName, gradeLevel);
        this.engScore = engScore;
        this.entryScore = entryScore;
    }

    public float getEngScore() {
        return engScore;
    }

    public NormalStudent setEngScore(float engScore) {
        this.engScore = engScore;
        return this;
    }

    public float getEntryScore() {
        return entryScore;
    }

    public NormalStudent setEntryScore(float entryScore) {
        this.entryScore = entryScore;
        return this;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Enter english score : ");
        engScore = sc.nextFloat();
        System.out.println("Enter entry score :");
        entryScore = sc.nextFloat();
        sc.nextLine();
    }

    public void showInfor() {
        System.out.println("Full name : " + getFullName());
        System.out.println("Day Of Birth : " + getDOB());
        System.out.println("Sex : " + getSex());
        System.out.println("Phone number : " + getPhoneNumber());
        System.out.println("University name : " + getUniversityName());
        System.out.println("Grade level : " + getGradeLevel());
        System.out.println("English score : " + getEngScore());
        System.out.println("Entry score : " +  getEntryScore());
    }


}
