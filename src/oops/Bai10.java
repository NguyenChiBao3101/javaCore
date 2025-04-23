package oops;

import java.util.Scanner;

public class Bai10 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a[][];
        int m, n;
        System.out.println("Nhap so hang :");
        m = sc.nextInt();
        System.out.println("Nhap so cot :");
        n = sc.nextInt();
        a = new int[m][]; // cap m dong
        for (int i = 0; i < m; i++) {
            a[i] = new int[n];    // moi dong cap n cot
        }

        // sinh gia tri ngau nhien cho ma tran
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 50);
            }
        }

        // xuat ma tran
        System.out.println("Ma tran la : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Nhap hang can tinh : ");
        int k = sc.nextInt();
        while( k > m) {
            System.out.println("Nhap lai so hang cho phu hop!!");
            k = sc.nextInt();
        }

        System.out.println("Tong hang la : " + tongHang(k,n,a));

    }
    static double tongHang(int k, int n, int a[][]) {
        int tong = 0;
        for(int j = 0; j < n; j++) {
            tong = tong + a[k][j];
        }
        return tong;
    }
}
