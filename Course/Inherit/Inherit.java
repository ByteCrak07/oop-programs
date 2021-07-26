
/*
Assignment-28-09-2020---Go through this program
Modify this program to 
1)Create 5 researcher objects and 5 hod objects in array.
2)Accept input from keyborad
3)Implement a menu driven program to print 
1)Salary/Details of any 1 hod 2)Salary/Details of any 1 researcher
  User should be able to iterate through menu by asking 
“Do you want to continue yes or no? till he gives a ‘no’.
*/
// A simple example of inheritance.
// Create a superclass.
import java.util.Scanner;

abstract class Person {
    // DATA Members
    String name;
    int age;
    int phonenumber;
    String address;

    // Constructor initializing only 2 data members
    Person(String name1, int age1) {
        name = name1;
        age = age1;
    }

    abstract void display();

}

// create a first level class
class Employee extends Person {
    double salary;

    // Constructor to initialize
    Employee(String name1, int age1, int phone1, String address1, double salary1) {
        // Constructor to initialize 2 data members of super class
        super(name1, age1);
        // initializing other data members
        phonenumber = phone1;
        address = address1;
        salary = salary1;
    }

    // A single method
    void printSal() {
        System.out.println(salary);
    }

    // overriding method display()
    void display() {
        System.out.println(name);
    }
}

// Create a second level subclass by extending class Employee.
class Researcher extends Employee {
    // its own data members
    String specialization;

    // constructor
    Researcher(String name1, int age1, int phone1, String address1, double salary1, String specialization1) {
        // call to parent constructor to intialize general data members
        super(name1, age1, phone1, address1, salary1);
        // initializing own data members
        specialization = specialization1;
    }

    // its own method-overriding method display()
    void display() {
        System.out.println(name + " " + age + " " + phonenumber + " " + address + " " + specialization);
    }
}

// Create second level subclass by extending class Employee.
class HOD extends Employee {
    // its own data members
    String department;

    // call to parent constructor to intialize general data members
    HOD(String name1, int age1, int phone1, String address1, double salary1, String department1) {
        // call to parent constructor to intialize general data members
        super(name1, age1, phone1, address1, salary1);
        // initializing own data members
        department = department1;
    }

    // its own method-overriding method display()
    void display() {
        System.out.println(name + " " + age + " " + phonenumber + " " + address + " " + department);
    }
}

class Inherit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Researcher[] one = new Researcher[5];
        HOD[] two = new HOD[5];
        String name, address, specialization, department;
        int age, phone, i, j, Case;
        double salary;
        char ch = 'Y';
        for (i = 0; i < 5; i++) {
            System.out.println("Enter name of Researcher: ");
            name = in.nextLine();
            System.out.println("Enter age: ");
            age = in.nextInt();
            System.out.println("Enter ph-no: ");
            phone = in.nextInt();
            in.nextLine();
            System.out.println("Enter address: ");
            address = in.nextLine();
            System.out.println("Enter salary: ");
            salary = in.nextDouble();
            in.nextLine();
            System.out.println("Enter specialization: ");
            specialization = in.nextLine();
            one[i] = new Researcher(name, age, phone, address, salary, specialization);
            System.out.println();
        }
        for (i = 0; i < 5; i++) {
            System.out.println("Enter name of HOD: ");
            name = in.nextLine();
            System.out.println("Enter age: ");
            age = in.nextInt();
            System.out.println("Enter ph-no: ");
            phone = in.nextInt();
            in.nextLine();
            System.out.println("Enter address: ");
            address = in.nextLine();
            System.out.println("Enter salary: ");
            salary = in.nextDouble();
            in.nextLine();
            System.out.println("Enter specialization: ");
            department = in.nextLine();
            two[i] = new HOD(name, age, phone, address, salary, department);
            System.out.println();
        }
        i = j = 0;
        while (true) {
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Choose an option");
                System.out.println("1. Display details and salary of a researcher");
                System.out.println("2. Display details and salary of an HOD");
                System.out.print("Enter selection: ");
                Case = in.nextInt();
                System.out.println();
                switch (Case) {
                    case 1:
                        System.out.println("Details of " + one[i].name + " are: ");
                        one[i].display();
                        System.out.println("Salary of " + one[i].name + " is: ");
                        one[i].printSal();
                        System.out.println();
                        i++;
                        break;

                    case 2:
                        System.out.println("Details of " + two[j].name + " are: ");
                        two[i].display();
                        System.out.println("Salary of " + two[j].name + " is: ");
                        two[i].printSal();
                        System.out.println();
                        j++;
                        break;

                    default:
                        System.out.println("Invalid entry!!");
                }
            } else if (ch == 'N' || ch == 'n') {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid entry!!");
            }
            System.out.print("Do you want to continue yes or no? ");
            ch = in.next().charAt(0);
            System.out.println();
        }
        in.close();
    }
}