package collection.list.management;

import java.util.*;

public class ListOfStudents {
    private ArrayList<Student> al;
    //create an empty constructor
    public ListOfStudents() {
        this.al = new ArrayList<Student>();
    }

    //create a constructor
    public ListOfStudents(ArrayList<Student> al) {
        this.al = al;
    }

    // method add Students
    public void addStudent(Student student) {
        this.al.add(student);
    }

    // method print list of students
    public void printList() {
        for(Student student : al) {
            System.out.println(student + "\n");
        }
    }

    //method check list empty
    public void checkListEmpty() {
        if(al.isEmpty() || al == null) {
            System.out.println("List is empty!!!");
        } else {
            System.out.println("List is not empty!!!");
        }
    }

    // method count numbers of List
    public void count() {
        int count = 0;
        for(int i = 0; i < al.size(); i++) {
            count++;
        }
        System.out.println("Number of students : " + count);
    }

    // method remove all the list
    public void removeList() {
        al.removeAll(al);
        System.out.println("List is removed!!!");
    }

    // method check any students in list or not
    public boolean checkStudent() {
        String newId;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an id you want to find :");
        newId = sc.nextLine();
        boolean check = false;
        for(Student student : al) {
            if (student.getId().contains(newId)) {
                check = true;
                System.out.println(student + "\n");
            }
        }
        return check;
    }

    // method remove one student int list base on student's id
    public boolean removeStudent() {
        String newId;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an id you want to remove :");
        newId = sc.nextLine();
        boolean check = true;
        for(Student student :al) {
            if(student.getId().contains(newId)) {
                al.remove(student);
                System.out.println("removed successfully!!!");
            }
            else {
                check = false;
            }
        }
        return check;
    }

    //method find students base on theirs name
    public void findStudent() {
        String newName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to find : ");
        newName = sc.nextLine();
        for(Student student : al) {
            if(student.getName().contains(newName)) {
                System.out.println(student + "\n");
            }
        }
    }

    //method sort the list of students in descending order of score
    public void sortList() {
        Collections.sort(this.al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getScore() < o2.getScore()) {
                    return -1;
                } else if(o1.getScore() > o2.getScore()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

    }
}
