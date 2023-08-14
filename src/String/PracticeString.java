package String;

import java.util.Scanner;

// Đếm số lượng phần tử của chuỗi (không tính khoảng trắng)
public class PracticeString {
    public static void main(String [] args ){
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi a : ");
        a = sc.nextLine();
        System.out.println("nhap chuoi b : ");
        b = sc.nextLine();
        // Nối chuỗi b vào chuỗi a
        System.out.println("Noi chuoi 2 vao chuoi 1 : " + a.concat(b));

        System.out.println("So luong phan tu la : " + count(a));
    }
    public static int count(String a) {
        int count = 0;
        boolean notCount = true;
        if(a == null) {
            return -1;
        }
        for(int i =0 ; i < a.length(); i++) {
            if (a.charAt(i) != ' ' && a.charAt(i) != '\n' && a.charAt(i) != '\t') {
                notCount = false;
                count++;
            } else {
                notCount = true;
            }
        }
        return count;
    }
}
