package String;

import java.util.Scanner;

public class Practice8 {

    public static void main(String [] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String a =  sc.nextLine();
        char b = 0;
        //Replace(a);
        Compare(a,b);
    }
    // Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
    // Ví dụ “shareprogramming.net” chuyển ‘e’ sang ‘*’ kết qủa “shar*programming.n*t”.
     private static void Replace(String a) {
         System.out.println(a.replace('a','*'));
     }

     //Chuỗi palindrome là chuỗi sau khi đảo ngược và chuỗi ban đầu hoàn toàn giống nhau,
     // ví dụ “aba” là một chuỗi “aba”
     private static void Compare(String a, char b) {
        for(int i = 0; i < a.length(); i++) {
            b = a.charAt(a.length() - i - 1);
            if(a.charAt(i) == b) {
                System.out.println("It is palindrome");
                break;
            } else {
                System.out.println("It is not palindrome");
                break;
            }
        }

     }
}
