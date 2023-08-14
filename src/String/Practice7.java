package String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
    Ví dụ "I am developer " => "developer am I" (Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.)*/
public class Practice7 {

    public static void main(String [] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can xu ly : ");
        a = sc.nextLine();
        System.out.println(RevertString(a));

    }
    private static String RevertString(String a) {
        List<String> words = Arrays.asList(a.split("\\s"));
        StringBuilder sb = new StringBuilder(a.length());
        for (int i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i));
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}
