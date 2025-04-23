package collection.map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    private static final int MAX = 5;
    public static void main(String [] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>() {

            // removeEldestEntry()
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > MAX;
            }
        };
        lhm.put("N","Nike");
        lhm.put("P", "Puma");
        lhm.put("A", "Adidas");
        lhm.put("N","NewBalance"); //
        lhm.put("L", "Louis Vuitton");
        for(Map.Entry m : lhm.entrySet()) {
            System.out.println("Brand " + m.getKey() + " : " +m.getValue());
        }
        System.out.println("------------------------");
        System.out.println("boolean containsValue() :");
        System.out.println(lhm.containsValue("Nike"));
        System.out.println(lhm.containsValue("NewBalance"));
        System.out.println("------------------------");
        System.out.println("forEach() method : ");
        lhm.forEach((key, value) -> {
            System.out.println(key + " # " + value);
        });
        System.out.println("------------------------");
        System.out.println("getOrDefault() method : ");
        System.out.println(lhm.getOrDefault("P", "Pum"));
        System.out.println(lhm.getOrDefault("N", "Nike"));
        System.out.println(lhm.getOrDefault("M", "new balance"));
        System.out.println("------------------------");
        System.out.println("boolean removeEldestEntry() method : ");
        lhm.put("C", "Chanel");
        System.out.println(lhm);
        lhm.put("D", "Dior");
        System.out.println(lhm);
        lhm.put("H","Hard mode");
        System.out.println(lhm);
        System.out.println("------------------------");
        System.out.println("replaceAll() : ");
        lhm.replaceAll((key, value) -> value.toUpperCase());
        System.out.println(lhm);
        System.out.println("------------------------");
        System.out.println("Collection<> value() :");
        Collection<String> values = lhm.values();
        System.out.println("values : " + values);
    }
}
