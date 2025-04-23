package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bai14Test {
    public static void main(String[] args) {
        try {
            // Tạo danh sách sinh viên và nhập thông tin
            ArrayList<Student> students = new ArrayList<>();
            students.add(new GoodStudent("Johnny", "01/01/1995", "Male", "0904533567", "UEL", "good", 9, "Scholarship A"));
            students.add(new GoodStudent("DoeDoe", "10/01/2003", "Female", "0906677788", "Harvard", "Good", 9, "Scholarship B"));
            students.add(new GoodStudent("John Doe", "20/03/1978", "Male", "0901222446", "VLU", "Great", 9, "Scholarship C"));
            students.add(new GoodStudent("Orab Sihc", "27/04/2021", "Female", "0901238899", "NLU", "Quite good", 9, "Scholarship D"));
            students.add(new NormalStudent("Alice Smith", "15/08/1998", "Male", "0987652217", "PTIT", "Good", 5, 8));
            students.add(new NormalStudent("Smith", "05/05/2000", "Female", "0987654321", "RMIT", "Normal", 4, 7));
            students.add(new NormalStudent("Alice ", "12/05/1898", "Male", "0987380087", "BKU", "Perfect", 8, 8));
            students.add(new NormalStudent("Jackie Chan", "30/05/2001", "Female", "0987166666", "UTE", "Good", 5, 8));

            // Hiển thị thông tin của tất cả sinh viên
            System.out.println("Thông tin tất cả sinh viên:");
            for (Student student : students) {
                student.showMyInfo();
                System.out.println("==========================");
            }

            // Sắp xếp danh sách sinh viên
            Collections.sort(students, new StudentComparator());

            // Chọn ứng viên trúng tuyển
            int numberOfStudentsToRecruit = 5; // Đặt số lượng cần tuyển dụng
            ArrayList<Student> selectedStudents = selectStudents(students, numberOfStudentsToRecruit);

            // Hiển thị thông tin của sinh viên trúng tuyển
            System.out.println("\nThông tin sinh viên trúng tuyển:");
            for (Student student : selectedStudents) {
                student.showMyInfo();
                System.out.println("++++++++++++++++++++++++++++++");
            }

        } catch (InvalidFullNameException | InvalidDOBException | InvalidPhoneNumberException e) {
            e.printStackTrace();
            System.out.println("Input files have unknown errors !!!");
        }
    }

    // Phương thức chọn ứng viên trúng tuyển
    private static ArrayList<Student> selectStudents(ArrayList<Student> students, int numberOfStudentsToRecruit) {
        ArrayList<Student> selectedStudents = new ArrayList<>();

        // Chọn sinh viên khá giỏi
        int numberOfGoodStudents = 0;
        if (numberOfStudentsToRecruit > 0) {
            // Sắp xếp danh sách sinh viên khá giỏi theo GPA giảm dần và tên tăng dần
            Collections.sort(students, new GoodStudentComparator());

            for (Student student : students) {
                if (student instanceof GoodStudent && numberOfGoodStudents < numberOfStudentsToRecruit) {
                    selectedStudents.add(student);
                    numberOfGoodStudents++;
                }
            }
        }

        // Chọn sinh viên trung bình nếu cần
        int numberOfNormalStudents = 0;
        if (numberOfStudentsToRecruit > 0) {
            // Sắp xếp danh sách sinh viên trung bình theo điểm thi đầu vào giảm dần và TOEIC giảm dần
            Collections.sort(students, new NormalStudentComparator());

            for (Student student : students) {
                if (student instanceof NormalStudent && numberOfNormalStudents < numberOfStudentsToRecruit) {
                    selectedStudents.add(student);
                    numberOfNormalStudents++;
                }
            }
        }
        return selectedStudents;
    }
}

// Lớp cha chung cho tất cả sinh viên
abstract class Student {
    protected String fullName;
    protected String doB;
    protected String sex;
    protected String phoneNumber;
    protected String universityName;
    protected String gradeLevel;

    // Constructor
    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        validateFullName(fullName);
        validateDOB(doB);
        validatePhoneNumber(phoneNumber);

        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    // Phương thức hiển thị thông tin sinh viên
    public void showMyInfo() {
        System.out.println("Họ và Tên: " + fullName);
        System.out.println("Ngày sinh: " + doB);
        System.out.println("Giới tính: " + sex);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Trường đã học: " + universityName);
        System.out.println("Xếp loại tốt nghiệp: " + gradeLevel);
    }

    // Phương thức kiểm tra hợp lệ của tên
    private void validateFullName(String fullName) throws InvalidFullNameException {
        if (fullName.length() < 5 || fullName.length() > 50) {
            throw new InvalidFullNameException("Invalid full name length: " + fullName);
        }
    }

    // Phương thức kiểm tra hợp lệ của ngày sinh
    private void validateDOB(String doB) throws InvalidDOBException {
        if (!doB.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new InvalidDOBException("Invalid date of birth: " + doB);
        }
    }

    // Phương thức kiểm tra hợp lệ của số điện thoại
    private void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("^(090|098|091|031|035|038)\\d{7}$")) {
            throw new InvalidPhoneNumberException("Invalid phone number: " + phoneNumber);
        }
    }
}

// Lớp sinh viên khá giỏi
class GoodStudent extends Student {
    double gpa;
    private String bestRewardName;

    // Constructor
    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    // Override phương thức hiển thị thông tin sinh viên
    @Override
    public void showMyInfo() {
        super.showMyInfo();
        System.out.println("Điểm trung bình học tập: " + gpa);
        System.out.println("Loại học bổng/Giải thưởng cao nhất: " + bestRewardName);
    }
}

// Lớp sinh viên trung bình
class NormalStudent extends Student {
    int englishScore;
    double entryTestScore;

    // Constructor
    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, double entryTestScore) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    // Override phương thức hiển thị thông tin sinh viên
    @Override
    public void showMyInfo() {
        super.showMyInfo();
        System.out.println("Điểm TOEIC: " + englishScore);
        System.out.println("Điểm thi đầu vào: " + entryTestScore);
    }
}

// Lớp tạo ngoại lệ cho tên không hợp lệ
class InvalidFullNameException extends Exception {
    public InvalidFullNameException(String message) {
        super(message);
    }
}

// Lớp tạo ngoại lệ cho ngày sinh không hợp lệ
class InvalidDOBException extends Exception {
    public InvalidDOBException(String message) {
        super(message);
    }
}

// Lớp tạo ngoại lệ cho số điện thoại không hợp lệ
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Lớp comparator để sắp xếp danh sách sinh viên
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.fullName.compareTo(s2.fullName); // Sắp xếp theo fullName giảm dần
    }
}
// Lớp comparator để sắp xếp danh sách sinh viên khá giỏi
class GoodStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1 instanceof GoodStudent && s2 instanceof GoodStudent) {
            GoodStudent g1 = (GoodStudent) s1;
            GoodStudent g2 = (GoodStudent) s2;

            // Sắp xếp theo GPA giảm dần
            int gpaComparison = Double.compare(g2.gpa, g1.gpa);
            if (gpaComparison != 0) {
                return gpaComparison;
            }

            // Nếu có cùng GPA, sắp xếp theo họ tên tăng dần
            return s1.fullName.compareTo(s2.fullName);
        }

        return 0;
    }
}

// Lớp comparator để sắp xếp danh sách sinh viên trung bình
class NormalStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1 instanceof NormalStudent && s2 instanceof NormalStudent) {
            NormalStudent n1 = (NormalStudent) s1;
            NormalStudent n2 = (NormalStudent) s2;

            // Sắp xếp theo điểm thi đầu vào giảm dần
            int entryTestComparison = Double.compare(n2.entryTestScore, n1.entryTestScore);
            if (entryTestComparison != 0) {
                return entryTestComparison;
            }

            // Nếu có cùng điểm thi đầu vào, sắp xếp theo điểm TOEIC giảm dần
            int toeflComparison = Integer.compare(n2.englishScore, n1.englishScore);
            if (toeflComparison != 0) {
                return toeflComparison;
            }

            // Nếu có cùng điểm TOEIC, sắp xếp theo họ tên tăng dần
            return s1.fullName.compareTo(s2.fullName);
        }

        return 0;
    }
}
