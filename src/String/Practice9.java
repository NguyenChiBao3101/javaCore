package String;

import java.util.ArrayList;
import java.util.Scanner;

//Cho một chuỗi str, xoá các ký tự xuất hiện nhiều hơn một lần trong chuỗi và chỉ giữ lại ký tự đầu tiên,
// vi dụ bananas => bans
public class Practice9 {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi :" );
        String a = sc.nextLine();
        System.out.println(removeDuplicateChar(a));

    }
    private static String removeDuplicateChar(String a) {
        ArrayList<Character> al = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++) {
            if(!al.contains(a.charAt(i))) {
                sb.append(a.charAt(i));
                al.add(a.charAt(i));
            }
        }
        return sb.toString();
    }
}
