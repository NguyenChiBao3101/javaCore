package polymorphism;

public class RuntimePolymorphism {
    void eat() {
        System.out.println("eating");
    }
}
    class Cat extends RuntimePolymorphism{
        void eat(){System.out.println("drinking milk");}
    }
    class BabyCat extends Cat{
        public static void main(String args[]){
            RuntimePolymorphism a;
            a=new BabyCat(); // upcasting
            a.eat();
        }
    }
    //Since, BabyCat is not overriding the eat() method, so eat() method of Cat class is invoked.



