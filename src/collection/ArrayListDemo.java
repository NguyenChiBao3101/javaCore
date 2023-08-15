package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main( String [] args) {
        // khai bao
       ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so chuoi :");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap chuoi " + i + " : ");
            list.add(sc.nextLine());
        }
//        for (String item : list) {
//            System.out.println(item);
//        }
        // duyet mang
        for(int i = 0; i < list.size();i++ ) {
            System.out.println("Chuoi " + i + " : " + list.get(i));
        }
        System.out.println("Nhap vi tri can xoa : ");
        list.remove(sc.nextInt());
        System.out.println("Nhap vi tri can thay doi");
        list.set(2,"*****");

        for(int i = 0; i < list.size();i++ ) {
            System.out.println("Chuoi " + i + " : " + list.get(i));
        }
        System.out.println("----------------");
        //System.out.println(list.subList(3,6));
        // iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

