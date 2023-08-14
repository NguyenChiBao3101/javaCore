package String;
import java.util.Scanner;

// dem so luong nguyen am, phu am cua chuoi
public class Practice5 {

    public static void main(String [] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        CountVowels(a);
    }
    private static void CountVowels(String a) {
        char [] chars = a.toCharArray();
        int count = 0;
        for(char c : chars) {
            switch(c) {
                case 'e' :
                case 'u' :
                case 'o' :
                case 'a' :
                case 'i' :
                    count++;
                    break;
            }
        }
        System.out.println("So nguyen am  : " + count);
        System.out.println("so phu am : " + (a.length() - count));
    }
}
