package designPattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Enter name of plan which the bill be generated: ");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String planName =  br.readLine();
        Scanner sc = new Scanner(System.in);
        String planName = sc.nextLine();
        System.out.println("Enter the number of units foe bill will be calculated : ");
        //int units = Integer.parseInt(br.readLine());
        int units = sc.nextInt();
        sc.nextLine();
        //
        Plan p = planFactory.getPlan(planName);


        System.out.println("Bill amount for " + planName + " of " + units + " units is : ");
        p.getRate();
        p.calculateBill(units);
    }
}
