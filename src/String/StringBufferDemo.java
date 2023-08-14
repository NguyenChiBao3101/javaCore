package String;

import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        buffer.append(sc.nextLine());
        System.out.println(buffer.deleteCharAt(6));
        System.out.println(buffer.insert(7,sc.nextLine()));
        System.out.println(buffer.reverse());
        System.out.println(buffer);

    }
}
