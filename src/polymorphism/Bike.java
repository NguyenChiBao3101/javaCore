package polymorphism;
// final keyword
 public class Bike {
    final int speed = 60;   // final variable
    // final method.
    final void run() {
        //speed = 100; // error
         System.out.println("Run safety!!");
    }
}
class Honda extends Bike {
//    void run() {
//        error
//    }
    public static void main(String [] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
// if any class is made as final, can be extended
class Honda1 extends Bike {
    public static void main(String[] args) {
        // final method is inherited but can not override it
        new Honda1().run();
    }
}
