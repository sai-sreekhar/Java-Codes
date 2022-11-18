public class Main {
    public static void main(String[] args) {
        GeometricObject[] objects = { new Square(2), new Circle(5), new Square(5), new Rectangle(3, 4),
                new Square(4.5) };

        for (int i = 0; i < objects.length; i++) {

            System.out.println("Area is " + objects[i].getArea());

            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
        }
    }
}

interface Colorable {
    public void howToColor();
}

class Square extends GeometricObject implements Colorable {

    public double side;

    public Square() {
        side = 0.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}

class Rectangle extends GeometricObject implements Colorable {

    private double length;
    private double breadth;

    public Rectangle() {
        length = 0.0;
        breadth = 0.0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setbreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}

class Circle extends GeometricObject implements Colorable{
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The radius of circle is " + radius);
    }

    
    @Override
    public void howToColor() {
        System.out.println("Color entire area enclosed.");
    }

}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    protected GeometricObject() {
        filled = false;
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "color: " + color
                + " and filled: " + filled;
    }

    public abstract double getArea();
}
