package String;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String text = "Nguyen Chi Bao";
        Scanner sc= new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        builder.append(sc.nextLine());
        builder.deleteCharAt(7);
        //System.out.println(builder.insert(18,sc.nextLine()));
        System.out.println(builder.reverse());
        builder.trimToSize();
    }
}
