package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main( String [] args) {
        List<String> l1 = new LinkedList<String>();
        l1.add("Nguyen Chi Bao");
        l1.add("PTIT");
        l1.add(1,"D21CQAT01-N");
        for (String a : l1) {
            System.out.println(a);
        }
        List<String> l2 = new LinkedList<String>();
        l2.add("basketball");
        l2.add("football");
        l2.addAll(l1);
        System.out.println(l2);
        System.out.println("--------------------");
        Iterator<String> itr = l2.listIterator();

        // Iterator
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

