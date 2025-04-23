package oops.bai14;


import java.util.Comparator;
import java.util.Scanner;


 abstract public class Student {
    private String fullName, DOB, sex, phoneNumber, universityName;

    Scanner sc = new Scanner(System.in);
    private int gradeLevel;
    abstract public void showInfor();

    public Student() {
        fullName = "";
        DOB = "";
        sex = "";
        phoneNumber = "";
        universityName = "";
    }
    public Student(String fullName, String DOB, String sex, String phoneNumber, String universityName, int gradeLevel) {
        this.fullName = fullName;
        this.DOB = DOB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getDOB() {
        return DOB;
    }

    public Student setDOB(String DOB) {
        this.DOB = DOB;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Student setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Student setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Student setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public Student setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
        return this;
    }

    public void input()  {
        Regex r = new Regex();
        try {
            System.out.println("Enter full name :");
            fullName = sc.nextLine();
            fullName = r.regexName(fullName);
            System.out.println("Enter date of birth :");
            DOB = sc.nextLine();
            System.out.println("Enter sex :");
            sex = sc.nextLine();
            System.out.println("Enter phone number :");
            phoneNumber = sc.nextLine();
            System.out.println("Enter university name :");
            universityName = sc.nextLine();
            System.out.println("Enter grade level :");
            gradeLevel = sc.nextInt();
            sc.nextLine();

            Exceptions e = new Exceptions();
            e.validateFullName(fullName);
            e.validateDOB(DOB);
            e.validatePhoneNumber(phoneNumber);
            fullName = r.regexName(fullName);
        }
        catch(Exceptions.InvalidFullNameException | Exceptions.InvalidDOBException |
              Exceptions.InvalidPhoneNumberException e) {
            System.out.println("Caught exception : " + e.getMessage());
        }

    }
 }



