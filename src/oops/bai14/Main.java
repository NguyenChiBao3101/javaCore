package oops.bai14;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {


        ListOfStudents l = new ListOfStudents();

        Scanner sc = new Scanner(System.in);

        int s;
        System.out.println(" ----------- MENU ----------- ");
        do {
            System.out.println("1.Add list.");
            System.out.println("2.Show information.");
            System.out.println("3.Interview.");
            //System.out.println("4.Show student recruitment list");
            System.out.println("Choose your choice :");
            s = sc.nextInt();
            sc.nextLine();
            switch(s) {
                case 1 : {
                    //l.add();
                    break;
                }
                case 2 : {
                    System.out.println( "1.Good student." + "\n" +
                                        "2.Normal student.");
                    System.out.println("choose choice :");
                    int s1 = sc.nextInt();
                    sc.nextLine();
                    if(s1 ==1 ) {
                        l.showGS();;
                    } else if(s1 == 2) {
                        l.showNS();
                    } else {
                        System.out.println("Wrong choice!!!");
                        return;
                    }
                    break;
                }
                case 3 : {
                    l.interview();
                    break;
                }
                default :{
                    System.out.println("Wrong choice!!!");
                    return;
                }
            }
        } while(s != 0);
    }
}
