package oops.bai8;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public Student setClassName(String className) {
        this.className = className;
        return this;
    }

    // Method to insert student info
    public void insertStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter student's class name: ");
        this.className = scanner.nextLine();
    }

    // Method to print student info
    public void printStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Class Name: " + this.className);
    }

}
