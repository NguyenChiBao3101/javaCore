package polymorphism;

public class Upcasting {
    float rateOfInternet() {
        return 0;
    }
}
class ABC extends Upcasting {
    float rateOfInternet() {
        return 8.4f;
    }
}

class Agribank extends Upcasting {
    float rateOfInternet() {
        return 7.8f;
    }
}

class Techcombank extends Upcasting {
    float rateOfInternet() {
        return 9.5f;
    }
}
class TestRuntimePolymorphism {
    public static void main(String [] args) {
        Upcasting a;
        a = new ABC();
        System.out.println("ABC rate of internet :" + a.rateOfInternet());
        a = new Agribank();
        System.out.println("Agribank rate of internet :" + a.rateOfInternet());
        a = new Techcombank();
        System.out.println("Techcombank rate of internet :" + a.rateOfInternet());
    }
}

/*class Bike{
 int speedlimit=90;
}
class Honda3 extends Bike{
 int speedlimit=150;

 public static void main(String args[]){
  Bike obj=new Honda3();
  System.out.println(obj.speedlimit);//90
}  */

// Output : 90
//Runtime polymorphism can't be achieved by data members.


