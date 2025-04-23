package oops.bai14;

public class GoodStudent extends Student {
    private float gpa;
    private String rewardName;


    public GoodStudent() {
        super();
        gpa = 0;
        rewardName = "";
    }

    public GoodStudent(String fullName, String DOB, String sex, String phoneNumber, String universityName, int gradeLevel, float gpa, String rewardName) {
        super(fullName, DOB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.rewardName = rewardName;
    }

    public float getGpa() {
        return gpa;
    }

    public GoodStudent setGpa(float gpa) {
        this.gpa = gpa;
        return this;
    }

    public String getRewardName() {
        return rewardName;
    }

    public GoodStudent setRewardName(String rewardName) {
        this.rewardName = rewardName;
        return this;
    }
    @Override
    public void input() {
        super.input();
        System.out.println("Enter gpa : ");
        gpa = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter reward name : ");
        rewardName = sc.nextLine();
    }
    public void showInfor() {
        System.out.println("Full name : " + getFullName());
        System.out.println("Day Of Birth : " + getDOB());
        System.out.println("Sex : " + getSex());
        System.out.println("Phone number : " + getPhoneNumber());
        System.out.println("University name : " + getUniversityName());
        System.out.println("Grade level : " + getGradeLevel());
        System.out.println("GPA : " + getGpa());
        System.out.println("Reward name : " +  getRewardName());
    }


}
