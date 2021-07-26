import java.util.Scanner;

public class Area
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int c;
        char ch;
        float a,l,b,h,r;
        ch = 'Y';
        while (ch == 'Y' || ch == 'y')
        {
            System.out.println("Enter selection to find the area");
            System.out.println("1)Triangle\n2)Rectangle\n3)Square\n4)Circle");
            System.out.print("Enter selection: ");
            c = in.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("Enter base and height: ");
                    b = in.nextFloat();
                    h = in.nextFloat();
                    System.out.println("Area of triangle: " + 0.5*b*h);
                    break;

                case 2:
                    System.out.print("Enter length and breadth: ");
                    l = in.nextFloat();
                    b = in.nextFloat();
                    System.out.println("Area of rectangle: " + l*b);
                    break;

                case 3:
                    System.out.print("Enter side length: ");
                    a = in.nextFloat();
                    System.out.println("Area of square: " + a*a);
                    break;

                case 4:
                    System.out.print("Enter radius: ");
                    r = in.nextFloat();
                    System.out.println("Area of circle: " + 3.1415*r*r);
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