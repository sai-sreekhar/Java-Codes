import java.util.Scanner;

class GeometricObject {
	private String color;
	private boolean filled;

	public GeometricObject() {
		color = "white";
		filled = true;
	}

	public GeometricObject(String c, boolean f) {
		this.color = c;
		this.filled = f;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		this.color = c;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean f) {
		this.filled = f;
	}

	public String toString() {
		return "Color: " + color + " and filled: " + filled;
	}
}

class Triangle extends GeometricObject {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;

	public Triangle() {
		super();
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
	}

	public Triangle(double x, double y, double z, String c, boolean f) {
		super(c, f);
		side1 = x;
		side2 = y;
		side3 = z;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public void show() {
		System.out.println(side1 + "," + side2 + "," + side3 + ",");
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = s * (s - side1) * (s - side2) * (s - side3);
		return Math.sqrt(area);

	}

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	public String toString() {

		return "Triangle has sides side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3 + " " +
				super.toString();
	}
}

public class Main {
	public static void main(String[] args) {

		double x, y, z;
		String c;
		boolean f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of triangle below: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.println("Enter whether triangle is filled (t/f): ");
		f = sc.nextBoolean();
		System.out.println("Enter the color: ");
		c = sc.next();
		Triangle triangleObj = new Triangle(x, y, z, c, f);

		System.out.println("Area of Triangle " + triangleObj.getArea());
		System.out.println("Perimeter of triangle " + triangleObj.getPerimeter());
		System.out.println("Color of the Triangle is " + triangleObj.getColor());
		System.out.println("Is triangle fille1d: " + triangleObj.isFilled());
	}
}
