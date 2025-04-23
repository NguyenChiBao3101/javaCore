package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String [] args){
        Map <Integer, String>  map = new HashMap<Integer, String>();
        map.put(12,"baro");
        map.put(15,"TranBien");
        map.put(8,"Nguyen Chi Bao");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}




