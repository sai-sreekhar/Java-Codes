import java.util.*;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    Circle() {
        radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    Square() {
        side = 1;
    }

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

class Chiru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape shape1 = new Circle();
        System.out.println("The area of shape 1 is " + shape1.getArea());
        Shape shape2 = new Rectangle(5, 4);
        System.out.println("The area of shape 2 is " + shape2.getArea());
        sc.close();
    }

}