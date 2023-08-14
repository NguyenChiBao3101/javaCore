package String;

import java.util.Scanner;

//Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
// Nếu có xuất ra “OK” ngược lại “KO”.
// Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
public class Practice3 {

    public static void main (String [] args) {
        StringBuilder sb1 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi 1 :");
        sb1.append(sc.nextLine());
        //sb1 = sc.nextLine();

        StringBuilder sb2 = new StringBuilder();
        System.out.println("Nhap chuoi 2 :");
        sb2.append(sc.nextLine());

        System.out.println("sb1 :" + sb1);
        System.out.println("sb2 :" + sb2);

        if(sb1.toString().equals(sb2.reverse().toString())) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }

        System.out.println("sb1 :" + sb1);
        System.out.println("sb2 :" + sb2);

    }
}
