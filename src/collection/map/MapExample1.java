package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Comparing By Key
public class MapExample1 {
    public static void main(String [] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Cheese Baro");
        map.put(2,"Nguyen Chi Bao");
        map.put(3,"Nguyen Meo Xu");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
