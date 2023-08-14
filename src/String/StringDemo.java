package String;

import java.util.Scanner;
// methods of String, +=
public class StringDemo {
    public static void main(String[] args) {
        String text = new String("chi");
        String text1 = new String("bao");
        String s = String.join(" ", text,text1);
        System.out.println(s.toString());
        //System.out.println(text += " bao");
        //System.out.println(s);
//        System.out.println(text);               // in chuoi text
//        System.out.println(text.charAt(5));     // in gia tri phan tu tai vi tri chi dinh
//        System.out.println(text.equals(text2)); // so sanh giong nhau giua chuoi text vs text2
//        System.out.println(text.length());      // in ra do dai chuoi text
//        System.out.println(text.toLowerCase()); // in thuong
//        System.out.println(text.toUpperCase()); // in hoa
//        System.out.println(text.codePointAt(9)); // so thap phan cua phan tu trong Bang ma ascii
//        System.out.println(text.substring(6,10)); // cat chuoi
        //System.out.println(text);
        //System.out.println(text);

    }
}
