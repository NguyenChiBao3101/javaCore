package collection.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String [] args) {
        TreeSet ts = new TreeSet();
        ts.add("Andree");
        ts.add("Bray");
        ts.add("Cici");
        ts.add("Elsa");
        ts.add("Double2T");
        ts.add("");
        System.out.println("Initial : " + ts);
        System.out.println("Reverse : " + ts.descendingSet());
        System.out.println("Ceiling : " + ts.ceiling("Baro"));
        System.out.println("HeadSet : " +  ts.headSet("Cici",false));
        System.out.println("SubSet1 : " + ts.subSet("Andree", false, "Double2T", true));
        System.out.println("SubSet2 : " + ts.subSet("Cici","Elsa"));
        System.out.println("TailSet1 : " + ts.tailSet("Cici", true));
        System.out.println(ts.removeAll(ts));
        System.out.println(ts);

    }

}
