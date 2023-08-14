package String;

import java.util.Scanner;
// kiem tra chuoi xem co chu so hay ko
public class Practice4 {

    public static void main(String [] args) {
        String a;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap chuoi : ");
        a = sc.nextLine();
        if(isValid(a)) {
            System.out.println("Hop le!!!");
        } else {
            System.out.println("Khong hop le!!!");
        }
    }

    public  static boolean isValid( String a) {
        for(int i = 0; i < a.length() ; i++) {
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9')
                return false;
        }
        return true;
    }
}
