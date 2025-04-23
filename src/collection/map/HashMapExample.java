package collection.map;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"Mango");
        map.put(4,"Apple");
        map.put(5,"Banana");
        map.put(3,"Grapes");
        map.put(2,"Orange");
        map.put(1,"Peach"); // Not allowed duplicated key
        System.out.println("----Map Iterator-----");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("clone() method :");
        System.out.println(map.clone());

        System.out.println("putAll() method :");

        HashMap <Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(9,"Six");
        map2.put(7, "Seven");
        map2.put(10,"Eight");
        map2.put(6,"Nine");
        map2.put(8,"Ten");
        map2.put(5,"Eleven"); // allowed duplicated value
        map2.putAll(map);   // datatype of both maps must be equal
        for(Map.Entry m : map2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("remove() method :");
        System.out.println(map2.remove(1));
        System.out.println("Map after removing :" + map2+ "\n");

        System.out.println("boolean containsKey() method :");
        System.out.println(map2.containsKey(3));
        System.out.println(map2.containsKey(12) + "\n");

        System.out.println("boolean equal() method :");     //????
        System.out.println(map2.equals("Eleven"));
        System.out.println("Map after equal() :"+ map2);

        System.out.println("replace() method : ");
        System.out.println(map2.replace(6,"Nine","Big hero 6"));
        System.out.println("map after replacing " + map2+ "\n");

        System.out.println("merge() method :");
        String returnValue = map2.merge(8,"New Number",(oldValue, newValue) -> oldValue +"/" + newValue );
        System.out.println( "Updated map :" + map2);
        //-------------other merge() method----------------

        HashMap<String, Integer> prices1 = new HashMap<>();
        prices1.put("Pant", 230);
        prices1.put("Shoes", 350);
        System.out.println("HashMap 1: " + prices1);

        HashMap<String, Integer> prices2 = new HashMap<>();
        prices2.put("Shirt", 150);
        prices2.put("Shoes", 320);
        System.out.println("HashMap 2: " + prices2);

        // forEach() access each entries of prices2
        // merge() inserts each entry from prices2 to prices1
        prices2.forEach((key, value) -> prices1.merge(key, value, (oldValue, newValue) -> {

            // return the smaller value
            if (oldValue < newValue) {
                return oldValue;
            }
            else {
                return newValue;
            }
        }));

        System.out.println("Merged HashMap: " + prices1);


        //* HashMap maintains order of key?
    }
}
