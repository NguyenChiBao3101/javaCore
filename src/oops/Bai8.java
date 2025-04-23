package oops;

import java.util.Scanner;

public class Bai8 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong ma :");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang : ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print((char)a[i]);
        }

    }
}
