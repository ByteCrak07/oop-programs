import java.io.*;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter two numbers to be divided: ");
        a = in.nextInt();
        b = in.nextInt();
        try {
            c = a / b;
            System.out.println(a + "/" + b + " = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception!!");
            System.out.println(e);
        } finally {
            System.out.println("Finally block works");
        }
        in.close();
    }
}
