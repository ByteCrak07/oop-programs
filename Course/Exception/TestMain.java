import java.util.Scanner;

class NumberIsGreaterException extends Exception {
    NumberIsGreaterException() {
        System.out.println("Marks Exceeded");
    }
}

public class TestMain {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int internal, external;
        System.out.print("Enter Internal marks: ");
        internal = in.nextInt();
        System.out.print("Enter External marks: ");
        external = in.nextInt();
        try {
            if (internal > 40 || external > 60) {
                throw new NumberIsGreaterException();
            }
        } catch (NumberIsGreaterException e) {
            System.out.println(e);
        }
        in.close();
    }
}