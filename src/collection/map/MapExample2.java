package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Comparing By Value
public class MapExample2 {
    public static void main(String [] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(4,"Orab Sihc");
        map.put(9,"Chi Bao");
        map.put(7,"Baro");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
