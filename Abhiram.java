import java.util.Scanner;

abstract class Product {
    abstract double getStockAvailability();

    abstract void printSalesReport();
}

class Food_Products extends Product {
    double quantity;
    double vat = 0.05;
    double price;
    double total_Sales;

    Food_Products(double quantity, double price) {
        this.quantity = quantity;
        this.price = price;
        total_Sales = quantity * price + vat * quantity * price;
    }

    public double getStockAvailability() {
        return quantity;
    }

    @Override
    public void printSalesReport() {
        System.out.println("The Quantity is: " + quantity);
        System.out.println("The Total Sales are: " + total_Sales);
    }

}

class Electronic_Accessories extends Product {
    double quantity;
    double vat = 0.12;
    double price;
    double total_Sales;

    Electronic_Accessories(double quantity, double price) {
        this.quantity = quantity;
        this.price = price;
        total_Sales = quantity * price + vat * quantity * price;
    }

    public double getStockAvailability() {
        return quantity;
    }

    @Override
    public void printSalesReport() {
        System.out.println("The Quantity taken is: " + quantity);
        System.out.println("The Total Sales are: " + total_Sales);
    }

}

class Abhiram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity of Food Product: ");
        double quantity = sc.nextDouble();
        System.out.println("Enter the Price of Food Product: ");
        double price = sc.nextDouble();
        Product foodProd1 = new Food_Products(quantity, price);
        System.out.println("The Sales Report of Food Product is: ");
        foodProd1.printSalesReport();

        System.out.println("Enter the Quantity of Electronic Accessory: ");
        quantity = sc.nextDouble();
        System.out.println("Enter the Price of  Electronic Accessory: ");
        price = sc.nextDouble();
        Product electronicAcc1 = new Electronic_Accessories(quantity, price);
        System.out.println("The Sales Report of Electronic Accessories is: ");
        electronicAcc1.printSalesReport();
    }
}