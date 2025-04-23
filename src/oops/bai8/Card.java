package oops.bai8;

import java.util.Scanner;

public class Card {
    private Student student;
    private String id;
    private String borrowDate;
    private String paymentDate;
    private int bookId;

    public Card(Student student, String id, String borrowDate, String paymentDate, int bookId) {
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public Card() {

    }

    public Student getStudent() {
        return student;
    }

    public Card setStudent(Student student) {
        this.student = student;
        return this;
    }

    public String getId() {
        return id;
    }

    public Card setId(String id) {
        this.id = id;
        return this;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public Card setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
        return this;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public Card setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public int getBookId() {
        return bookId;
    }

    public Card setBookId(int bookId) {
        this.bookId = bookId;
        return this;
    }

    // Method to insert card info
    public void insertCardInfo() {
        Scanner scanner = new Scanner(System.in);

        // Assuming student object is created and initialized elsewhere
        if (this.student == null) {
            this.student = new Student();
            student.insertStudentInfo(); // Call insert method for student
        }

        System.out.print("Enter Card ID: ");
        this.id = scanner.nextLine();

        System.out.print("Enter borrow date (as integer): ");
        this.borrowDate = scanner.nextLine();

        System.out.print("Enter payment date (as integer): ");
        this.paymentDate = scanner.nextLine();

        System.out.print("Enter book ID: ");
        this.bookId = scanner.nextInt();
    }

    // Method to show card info
    public void showCardInfo() {
        System.out.println("Card Information:");
        student.printStudentInfo(); // Show student information
        System.out.println("Card ID: " + this.id);
        System.out.println("Borrow Date: " + this.borrowDate);
        System.out.println("Payment Date: " + this.paymentDate);
        System.out.println("Book ID: " + this.bookId);
    }
}

