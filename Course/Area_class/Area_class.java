import java.util.Scanner;

class Triangle
{
    double Area(float a, float b, float c)
    {
        float s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    double Perimeter(float a, float b, float c)
    {
        return a+b+c;
    }
}

class Rectangle
{
    double Area(float l, float b)
    {
        return l*b;
    }

    double Perimeter(float l, float b)
    {
        return 2*(l+b);
    }
}

class Square
{
    double Area(float a)
    {
        return a*a;
    }

    double Perimeter(float a)
    {
        return 4*a;
    }
}

class Circle
{
    double Area(float r)
    {
        return 3.1415*r*r;
    }

    double Perimeter(float r)
    {
        return 2*3.1415*r;
    }
}


public class Area_class
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int Case;
        char ch;
        float a,l,b,c,r;
        Triangle tri = new Triangle();
        Rectangle rect = new Rectangle();
        Square sq = new Square();
        Circle cir = new Circle();
        ch = 'Y';
        while (true)
        {
            if(ch == 'Y' || ch == 'y')
            {
                System.out.println("Enter selection to find the area and perimeter");
                System.out.println("1)Triangle\n2)Rectangle\n3)Square\n4)Circle");
                System.out.print("Enter selection: ");
                Case = in.nextInt();
                switch(Case)
                {
                    case 1:
                        System.out.print("Enter 3 side lengths: ");
                        a = in.nextFloat();
                        b = in.nextFloat();
                        c = in.nextFloat();
                        System.out.println("Area of triangle: " + tri.Area(a, b, c));
                        System.out.println("Perimeter of triangle: " + tri.Perimeter(a, b, c));
                        break;

                    case 2:
                        System.out.print("Enter length and breadth: ");
                        l = in.nextFloat();
                        b = in.nextFloat();
                        System.out.println("Area of rectangle: " + rect.Area(l, b));
                        System.out.println("Perimeter of rectangle: " + rect.Perimeter(l, b));
                        break;

                    case 3:
                        System.out.print("Enter side length: ");
                        a = in.nextFloat();
                        System.out.println("Area of square: " + sq.Area(a));
                        System.out.println("Perimeter of square: " + sq.Perimeter(a));
                        break;

                    case 4:
                        System.out.print("Enter radius: ");
                        r = in.nextFloat();
                        System.out.println("Area of circle: " + cir.Area(r));
                        System.out.println("Perimeter of circle: " + cir.Perimeter(r));
                        break;

                    default:
                        System.out.println("Invalid entry!!");
                }
            }
            else if(ch == 'N' || ch == 'n')
            {
                System.out.println("Exiting...");
                break;
            }
            else
            {
                System.out.println("Invalid entry!!");
            }
                System.out.print("Do you want to continue yes or no? ");
                ch = in.next().charAt(0);
        }
        in.close();
    }
}
