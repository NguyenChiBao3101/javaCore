package oops.bai14;

import java.io.InvalidObjectException;
import java.util.*;

public class ListOfStudents {


    private ArrayList<Student> students;

    private static ArrayList<Student> selectStudents(ArrayList<Student> students, int numberOfStudentsToRecruit) {
        ArrayList<Student> selectedStudents = new ArrayList<>();

        // Lựa chọn sinh viên khá giỏi
        int numberOfGoodStudentsToRecruit = Math.min(numberOfStudentsToRecruit, countGoodStudents(students));
        selectedStudents.addAll(selectGoodStudents(students, numberOfGoodStudentsToRecruit));

        // Kiểm tra xem còn cần tuyển bao nhiêu sinh viên
        int remainingStudentsToRecruit = numberOfStudentsToRecruit - selectedStudents.size();
        System.out.println("Remaining : " + remainingStudentsToRecruit);
        // Nếu vẫn còn cần tuyển thêm và không quá số lượng sinh viên trung bình
        if (remainingStudentsToRecruit > 0 && countNormalStudents(students) > 0) {
            int numberOfNormalStudentsToRecruit = Math.min(remainingStudentsToRecruit, countNormalStudents(students));
            selectedStudents.addAll(selectNormalStudents(students, numberOfNormalStudentsToRecruit));
        }

        return selectedStudents;
    }

    private static int countGoodStudents(ArrayList<Student> students) {
        // Đếm số lượng sinh viên khá giỏi trong danh sách
        return (int) students.stream().filter(student -> student instanceof GoodStudent).count();
    }

    private static ArrayList<Student> selectGoodStudents(ArrayList<Student> students, int count) {
        // Lựa chọn count sinh viên khá giỏi theo điểm GPA và ưu tiên theo họ tên
        ArrayList<Student> goodStudents = new ArrayList<>();
        goodStudents.addAll(students); // Thêm tất cả sinh viên vào danh sách tạm

        // Sắp xếp danh sách theo điểm GPA giảm dần và họ tên tăng dần
        Collections.sort(goodStudents, Comparator.comparing(student -> {
            if (student instanceof GoodStudent) {
                return ((GoodStudent) student).getGpa();
            } else {
                return Float.MIN_VALUE; // Nếu không phải là GoodStudent, đặt điểm GPA là giá trị nhỏ nhất
            }
        }).reversed());

        // Chọn count sinh viên đầu tiên
        return new ArrayList<>(goodStudents.subList(0, count));
    }

    private static int countNormalStudents(ArrayList<Student> students) {
        // Đếm số lượng sinh viên trung bình trong danh sách
        return (int) students.stream().filter(student -> student instanceof NormalStudent).count();
    }

    private static ArrayList<Student> selectNormalStudents(ArrayList<Student> students, int count) {

        // Lựa chọn count sinh viên trung bình theo điểm thi đầu vào và ưu tiên theo họ tên
        ArrayList<Student> normalStudents = new ArrayList<>();
        normalStudents.addAll(students); // Thêm tất cả sinh viên vào danh sách tạm

        // Sắp xếp danh sách theo điểm thi đầu vào giảm dần, điểm TOEIC giảm dần và họ tên tăng dần
        Collections.sort(normalStudents, Comparator.comparing(student -> {
            if (student instanceof NormalStudent) {
                return ((NormalStudent) student).getEntryScore();
            } else {
                return Float.MIN_VALUE; // Nếu không phải là NormalStudent, đặt điểm thi đầu vào là giá trị nhỏ nhất
            }
        }).reversed().thenComparing(student -> {
            if (student instanceof NormalStudent) {
                return ((NormalStudent) student).getEngScore();
            } else {
                return Float.MIN_VALUE; // Nếu không phải là NormalStudent, đặt điểm TOEIC là giá trị nhỏ nhất
            }
        }).reversed());

        // Chọn count sinh viên đầu tiên
        return new ArrayList<>(normalStudents.subList(0, count));
    }


    Scanner sc = new Scanner(System.in);
    public ListOfStudents() {
        students = new ArrayList<>();
        students.add(new GoodStudent("John", "01/01/1995", "Male", "0904533567", "UEL", 8, 9, "Scholarship A"));
        students.add(new GoodStudent("Doe", "10/01/2003", "Female", "0906677788", "Harvard", 8, 9, "Scholarship B"));
        students.add(new GoodStudent("John Doe", "20/03/1978", "Male", "0901222446", "VLU", 8, 9, "Scholarship C"));
        students.add(new GoodStudent("Dept", "27/04/2021", "Female", "0901238899", "NLU", 8, 9, "Scholarship D"));
        students.add(new NormalStudent("Alice Smith", "15/08/1998", "Male", "098765221", "PTIT", 9, 5, 8));
        students.add(new NormalStudent("Smith", "05/05/2000", "Female", "0987654321", "RMIT", 6, 4, 7));
        students.add(new NormalStudent("Alice ", "12/05/1898", "Male", "098738008", "BKU", 8, 8, 8));
        students.add(new NormalStudent("Jack", "30/05/2001", "Female", "098716666", "UTE", 7, 5, 8));

    }

    public void add() throws InvalidObjectException {
        System.out.println("Enter type student : ");
        System.out.println("1.Good student.");
        System.out.println("2.Normal student.");
        System.out.println("Choose the choice :");
        int choose = sc.nextInt();
        sc.nextLine();
        if (choose == 1) {
            GoodStudent g = new GoodStudent();
            g.input();
            students.add(g);
            System.out.println("Add successfully!!!");

        } else if (choose == 2) {
            NormalStudent n = new NormalStudent();
            n.input();
            students.add(n);
            System.out.println("Add successfully!!!");
        }
    }


    public void showGS() {
        System.out.println("------------ GOOD STUDENT ------------");
        for(Student student : students) {
            if(student.getClass().getSimpleName().equalsIgnoreCase("GoodStudent")) {
                student.showInfor();
                System.out.println("--------------------------------");
            }
        }
    }
    public void showNS() {
        System.out.println("------------ NORMAL STUDENT ------------");
        for(Student student : students) {
            if(student.getClass().getSimpleName().equalsIgnoreCase("NormalStudent")) {
                student.showInfor();
                System.out.println("--------------------------------");
            }
        }
    }

    public void interview() {

        int numberNeed = 5;
//        do {
//            System.out.println("Enter number of students to recruit (between 11 and 15) : ");
//            numberNeed = sc.nextInt();
//            sc.nextLine();
//        } while(numberNeed > 15 || numberNeed < 11);

        System.out.println("--------------Student recruitment list --------------");
        ArrayList<Student> selectedStudents = selectStudents(students, numberNeed);
        for (Student student :students) {
                student.showInfor();
                System.out.println("=====================");
        }
    }
 }

// Lớp comparator để sắp xếp danh sách sinh viên giỏi
class GoodStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1 instanceof GoodStudent && s2 instanceof GoodStudent) {
            GoodStudent g1 = (GoodStudent) s1;
            GoodStudent g2 = (GoodStudent) s2;

            // Sắp xếp theo GPA giảm dần
            int gpaComparison = Double.compare(g2.getGpa(), g1.getGpa());
            if (gpaComparison != 0) {
                return gpaComparison;
            }

            // Nếu có cùng GPA, sắp xếp theo họ tên tăng dần
            return s1.getFullName().compareTo(s2.getFullName());
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
            int entryTestComparison = Double.compare(n2.getEntryScore(), n1.getEntryScore());
            if (entryTestComparison != 0) {
                return entryTestComparison;
            }

            // Nếu có cùng điểm thi đầu vào, sắp xếp theo điểm TOEIC giảm dần
            int toeflComparison = Double.compare(n2.getEngScore(), n1.getEngScore());
            if (toeflComparison != 0) {
                return toeflComparison;
            }

            // Nếu có cùng điểm TOEIC, sắp xếp theo họ tên tăng dần
            return s1.getFullName().compareTo(s2.getFullName());
        }

        return 0;
    }
}