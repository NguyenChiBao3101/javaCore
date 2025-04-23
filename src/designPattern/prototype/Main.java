package designPattern.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int id=Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String name=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String designation=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String address=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double salary= Double.parseDouble(br.readLine());
        System.out.print("\n");
        //official
        EmployeeRecord e1 = new EmployeeRecord(id, name, designation, salary,address);

        e1.showRecord();
        System.out.println("\n");

        //(*) copy
        EmployeeRecord ec = (EmployeeRecord) e1.getClone();
        ec.showRecord();
    }
}
