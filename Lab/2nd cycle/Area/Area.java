import java.util.Scanner;

public class Area {
    double Area(float r) {
        return (3.1415 * r * r);
    }

    double Area(float l, float b) {
        return (l * b);
    }

    double Area(double b, double h) {
        return (0.5 * b * h);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Area Ar = new Area();
        int c;
        char ch;
        ch = 'Y';
        float r, le, br;
        double b, h;
        while (ch == 'Y' || ch == 'y') {
            System.out.println("Enter selection to find the area");
            System.out.println("1)Circle\n2)Rectangle\n3)Triangle");
            System.out.print("Enter selection: ");
            c = in.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter radius: ");
                    r = in.nextFloat();
                    System.out.println("Area of circle: " + Ar.Area(r));
                    break;

                case 2:
                    System.out.print("Enter length and breadth: ");
                    le = in.nextFloat();
                    br = in.nextFloat();
                    System.out.println("Area of rectangle: " + Ar.Area(le, br));
                    break;

                case 3:
                    System.out.print("Enter base and height: ");
                    b = in.nextDouble();
                    h = in.nextDouble();
                    System.out.println("Area of triangle: " + Ar.Area(b, h));
                    break;

                default:
                    System.out.println("Invalid entry!!");
            }
            System.out.print("Do you want to continue yes or no? ");
            ch = in.next().charAt(0);
            System.out.println();
        }
        in.close();
    }
}