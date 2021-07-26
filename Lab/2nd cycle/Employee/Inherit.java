import java.util.*;

class Employee {
    int Age, Phno, Salary;
    String Name, Address;

    void printSalary() {
        System.out.println(Salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String Name1, int Age1, int Phno1, String Address1, int Salary1, String specialization1) {
        Name = Name1;
        Age = Age1;
        Phno = Phno1;
        Address = Address1;
        Salary = Salary1;
        specialization = specialization1;
    }
}

class Manager extends Employee {
    String department;

    Manager(String Name1, int Age1, int Phno1, String Address1, int Salary1, String department1) {
        Name = Name1;
        Age = Age1;
        Phno = Phno1;
        Address = Address1;
        Salary = Salary1;
        department = department1;
    }
}

public class Inherit {
    public static void main(String[] args) {
        int Age, Phno, Salary;
        String Name, Address, specialization, department;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of Officer: ");
        Name = in.nextLine();
        System.out.println("Enter age of Officer: ");
        Age = in.nextInt();
        System.out.println("Enter phone number of Officer: ");
        Phno = in.nextInt();
        in.nextLine();
        System.out.println("Enter address of Officer: ");
        Address = in.nextLine();
        System.out.println("Enter salary of Officer: ");
        Salary = in.nextInt();
        in.nextLine();
        System.out.println("Enter specialization of Officer: ");
        specialization = in.nextLine();
        Officer of = new Officer(Name, Age, Phno, Address, Salary, specialization);

        System.out.println("\nEnter name of Manager: ");
        Name = in.nextLine();
        System.out.println("Enter age of Manager: ");
        Age = in.nextInt();
        System.out.println("Enter phone number of Manager: ");
        Phno = in.nextInt();
        in.nextLine();
        System.out.println("Enter address of Manager: ");
        Address = in.nextLine();
        System.out.println("Enter salary of Manager: ");
        Salary = in.nextInt();
        in.nextLine();
        System.out.println("Enter department of Manager: ");
        department = in.nextLine();
        Manager ma = new Manager(Name, Age, Phno, Address, Salary, department);

        System.out.println("\nDetails of Officer: ");
        System.out.println("Name: " + of.Name);
        System.out.println("Age: " + of.Age);
        System.out.println("Phone number: " + of.Phno);
        System.out.println("Address: " + of.Address);
        System.out.print("Salary: ");
        of.printSalary();
        System.out.println("Specialization: " + of.specialization);

        System.out.println("\nDetails of Manager: ");
        System.out.println("Name: " + ma.Name);
        System.out.println("Age: " + ma.Age);
        System.out.println("Phone number: " + ma.Phno);
        System.out.println("Address: " + ma.Address);
        System.out.print("Salary: ");
        ma.printSalary();
        System.out.println("Department: " + ma.department);

        in.close();
    }
}
