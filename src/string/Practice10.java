package string;

import java.util.Scanner;

// Viet chuong trinh cho nhap 1 so n, sau do tinh giai thua cua so do.
// vd nhap 8, output : 1*2*3*4*5*6*7*8 = 40320
public class Practice10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n : ");
        n = sc.nextInt();
        Tinh(n);
    }

    private static void Tinh(int n) {
        long multi = 1;
        for(int i = 1; i <= n  ;i++) {
            multi *= i;
        }
        System.out.println("tich luy thua la : "+ multi);
    }
}
