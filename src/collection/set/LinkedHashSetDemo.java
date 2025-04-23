package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    int id;
    String name, author, publisher;
    int quantity;
    public LinkedHashSetDemo(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}
class LinkedHashSetExample {
    public static void main(String [] args) {
        LinkedHashSet<LinkedHashSetDemo> lhs = new LinkedHashSet<LinkedHashSetDemo>();
        LinkedHashSetDemo l1 = new LinkedHashSetDemo(123,"20th age", "Jason", "Kim Dong", 20);
        LinkedHashSetDemo l2 = new LinkedHashSetDemo(456, "Harry Potter", "JK Rowling", "20th Century", 7);
        LinkedHashSetDemo l3 = new LinkedHashSetDemo(789, "Think like programmer", "Coder", "publisher", 2);

        lhs.add(l1);
        lhs.add(l2);
        lhs.add(l3);

        for(LinkedHashSetDemo l : lhs) {
            System.out.println(l.id + " " + l.name + " " + l.author + " " + l.publisher + " " + l.quantity);
        }
        // LinkedHashSet maintains insertion order
    }
}