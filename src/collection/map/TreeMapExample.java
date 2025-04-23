package collection.map;

import java.util.*;

public class TreeMapExample {
    public static void main(String [] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(/*Collections.reverseOrder()*/);
        tm.put(5,"pen");
        tm.put(2,"book");
        tm.put(7,"glue");
        tm.put(15,"notebook");
        tm.put(4,"pencil");
        tm.put(8,"ruler");
        tm.put(0,"pen");

        for(Map.Entry m : tm.entrySet() ) {
            System.out.println(m.getKey() + "  : " + m.getValue());
        }
        System.out.println("-------------");
        System.out.println("ceiling(key) :");
        System.out.println(tm.ceilingKey(6));

        System.out.println("clone() method : ");
        System.out.println(tm.clone());
        System.out.println();

        System.out.println("Comparator : ");
        Comparator comp = tm.comparator();
        System.out.println("Comparator value : " + comp);
        System.out.println();

        System.out.println("firstEntry() method :");
        System.out.println(tm.firstEntry()); // return the first key - value pair
        System.out.println();

        System.out.println("floorEntry() method :");
        System.out.println(tm.floorEntry(6)); // return the greatest key, but less than the specific key
        System.out.println();
        System.out.println("----------------------");
        System.out.println("sortMap() method : ");
        SortedMap sm =tm.headMap(7);
        System.out.println(sm);
        System.out.println(sm.keySet());
        System.out.println(sm.values());
        sm.put(6,"bag");
        System.out.println(sm);
        System.out.println("subMap() method :");
        System.out.println(sm.subMap(2,6));
        System.out.println("tailMap() method : ");
        System.out.println(sm.tailMap(5));
        System.out.println("lastKey() method : ");
        System.out.println(sm.lastKey());
        System.out.println("----------------------");
        System.out.println("NavigableMap() method : ");
        NavigableMap nm = tm.headMap(15,true);
        System.out.println(nm);
        System.out.println(nm.firstEntry());
        System.out.println(nm.lastEntry());
        System.out.println();
        System.out.println(nm.higherEntry(6));
        System.out.println();
        System.out.println(nm.lowerEntry(15));

    }
}
