package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String [] args) {
        HashSet set = new HashSet();
        set.add("cat");
        set.add("dog");
        set.add("fish");
        set.add("pig");
        set.add("cat");
        set.add("duck");
        set.add("pig"); // do not store ( because HashSet doesn't allow duplicate elements)
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
