package collection.list.management;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListOfStudents los = new ListOfStudents();
        int choise = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("------------MENU------------");
            System.out.println("1. Add student in list.\n"
            + "2. Print list of students.\n"
            + "3. Check List Empty or not.\n"
            + "4. Count numbers of students.\n"
            + "5. Remove all list.\n"
            + "6. Check 1 student in list or not, base on id.\n"
            + "7. Remove 1 student from the list base on id.\n"
            + "8. Find any student by name.\n"
            + "9. sort the list of students in descending order of score.\n"
            + "0. end programming.\n");
            System.out.print("Choose your choise : ");
            choise = sc.nextInt();
            switch(choise) {
                case 1 : {
                    int n;
                    System.out.println("Number of student you want to add :");
                    n = sc.nextInt();
                    for(int i = 1; i <= n ;i++) {
                        System.out.println("------Student " + i + " :");
                        sc.nextLine();
                        System.out.println("Enter your id : ");
                        String id = sc.nextLine();
                        System.out.println("Enter your name : ");
                        String name = sc.nextLine();
                        System.out.println("Enter your year of birth : ");
                        int dateOfBirth = sc.nextInt();
                        System.out.println("Enter your score : ");
                        double score = sc.nextDouble();
                        Student s = new Student(id, name, dateOfBirth, score);
                        los.addStudent(s);
                    }
                    System.out.println("add successfully!!!");
                    break;
                }
                case 2 : {
                    System.out.println("-------List of student ---------- \n");
                    los.printList();
                    break;
                }
                case 3 :{
                    los.checkListEmpty();
                    break;
                }
                case 4 : {
                    los.count();
                    break;
                }
                case 5 :{
                    los.removeList();
                    break;
                }
                case 6 : {
                    los.checkStudent();
                    break;
                }
                case 7 : {
                    los.removeStudent();
                    break;
                }
                case 8 : {
                    los.findStudent();
                    break;
                }
                case 9 :{
                    los.sortList();
                    los.printList();
                    break;
                }

            }
        }while(choise != 0);

    }
}
