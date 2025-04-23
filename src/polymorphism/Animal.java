package polymorphism;

// Super Keyword
public class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(color); // color of Dog class
        System.out.println(super.color); //color of Animal class
    }
}

class test {
    public void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}