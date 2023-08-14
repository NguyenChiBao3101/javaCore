package String;

import java.util.Scanner;

// chuyen doi tu String sang Integer bang Integer.parseInt()
public class Practice6 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi so : ");
        a = sc.nextLine();
        System.out.println("chuoi ban dau " + a);
        int number = ConVertNumber(a);
        System.out.println("sau khi chuyen doi chuoi sang chu : " + (number - 1) );

    }
    private static int ConVertNumber(String a) {
        int number = Integer.parseInt(a);
        return number;
    }
}
