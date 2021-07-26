abstract class Shape {
    abstract void numberofSides();
}

class Rectangle extends Shape {
    void numberofSides() {
        System.out.println("4");
    }
}

class Triangle extends Shape {
    void numberofSides() {
        System.out.println("3");
    }
}

class Hexagon extends Shape {
    void numberofSides() {
        System.out.println("6");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        Hexagon hex = new Hexagon();
        System.out.print("No of sides of Rectangle: ");
        rec.numberofSides();
        System.out.print("No of sides of Triangle: ");
        tri.numberofSides();
        System.out.print("No of sides of Hexagon: ");
        hex.numberofSides();
    }
}