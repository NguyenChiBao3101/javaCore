package collection.set.candidates;

import java.util.Scanner;

public class Main {
    public static  void main(String [] args) {
        ManagerCandidates manage = new ManagerCandidates();

        int choice;
        do {
            System.out.println("\n--------MENU-----------" +
                    "\n1. Add candidates." +
                    "\n2. Print list of candidates." +
                    "\n3. Find candidates by the id." +
                    "\n4. Ending the program.");
            System.out.println("select your choice :");
            Scanner scn = new Scanner(System.in);
            choice = scn.nextInt();
            switch(choice) {
                case 1 : {
                    System.out.println("Select Sector :");
                    System.out.println("a. A");
                    System.out.println("b. B");
                    System.out.println("c. C");
                    String choice1;
                    System.out.println("Select choice :");
                    scn.nextLine();
                    choice1 = scn.nextLine();
                    switch(choice1) {
                        case "a" : {
                            manage.addCandidate(createCandidate(scn,"a"));
                            break;
                        }
                        case "b" : {
                            manage.addCandidate(createCandidate(scn,"b"));
                            break;
                        }
                        case "c" : {
                            manage.addCandidate(createCandidate(scn, "c"));
                            break;
                        }
                        default:
                            throw new IllegalStateException("Unexpected value: " + choice);
                    }
                }
                break;
                case 2 : {
                    System.out.println("---------List of candidates--------\n");
                    manage.showInformationCandidates();
                    break;
                }
                case 3 : {
                    int newId;
                    System.out.println("select the id you want to find : ");
                    newId = scn.nextInt();
                    manage.findCandidates(newId);
                    break;
                }
                case 4 : {
                    return;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        } while (choice != 0);
    }
    public static Candidate createCandidate(Scanner scn, String candidate) {
    System.out.println("Candidate " + " :");
    System.out.println("Enter id : ");
    int id = scn.nextInt();
    System.out.println("Enter name : ");
    scn.nextLine();
    String name = scn.nextLine();
    System.out.println("Enter address :");
    String address = scn.nextLine();
    System.out.println("Enter priority : ");
    int priority = scn.nextInt();
    if (candidate.equals("a")) {
        return new SectorA(id, name, address, priority);
    } else if (candidate.equals("b")) {
        return new SectorB(id, name, address, priority);
    } else {
        return new SectorC(id, name, address, priority);
    }
    }
}
