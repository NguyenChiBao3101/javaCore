package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String [] args) {
        TreeSet ts = new TreeSet();
        /*ts.add("alpha");
        ts.add("chris");
        ts.add("doo");
        ts.add("beta");
        Iterator i = ts.iterator();
        while(i.hasNext()) {
            System.out.println(i.next() + " ");
            //treeSet maintains ascending order
        }*/
        ts.add(12);
        ts.add(32);
        ts.add(56);
        ts.add(89);
        System.out.println("Lowest Value: "+ts.pollFirst()); //out put : 12
        System.out.println("Highest Value: "+ts.pollLast()); // out put : 89
        System.out.println("TreeSet : " + ts);  // out put : [32, 56]
    }

}
