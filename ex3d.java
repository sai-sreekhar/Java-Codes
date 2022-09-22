import java.util.Scanner;

public class ex3d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double length, breadth, side, radius;

        System.out.println("Enter the length, breadth, side and radius");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        side = sc.nextDouble();
        radius = sc.nextDouble();

        Area areaObj = new Area();
        areaObj.RectangleArea(length, breadth);
        areaObj.SquareArea(side);
        areaObj.CircleArea(radius);
        sc.close();
    }
}

abstract class Shape {

    abstract void RectangleArea(double length, double breadth);

    abstract void SquareArea(double radius);

    abstract void CircleArea(double side);

}

class Area extends Shape {

    double Area = 0;

    @Override
    void RectangleArea(double length, double breadth) {
        Area = length * breadth;
        System.out.println("Area of rectangle is: " + Area);

    }

    @Override
    void SquareArea(double Side) {
        Area = Side * Side;
        System.out.println("Area of Square is: " + Area);

    }

    @Override
    void CircleArea(double radius) {
        Area = (radius * radius) * 3.14;
        System.out.println("Area of Circle is: " + Area);
    }

}
