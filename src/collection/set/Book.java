package collection.set;

import java.util.HashSet;

//Java HashSet Example: Book
public class Book {
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class HashSetExample {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<Book>();
        Book b1 = new Book(122, "20th age", "Jason", "Kim Dong", 20);
        Book b2 = new Book(310, "Harry Potter", "JK Rowling", "20th Century", 7);
        Book b3 = new Book(878, "Think like programmer", "Coder", "publisher", 2);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
