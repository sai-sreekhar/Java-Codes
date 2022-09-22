class Car {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, int price, String color, int quantity) {
        super();
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQueantity(int quantity) {
        this.price = quantity;
    }

    public void sell(int count) {
        this.quantity = this.quantity - count;
    }

    public String toString() {
        return "model= " + model + ", brand= " + brand + ", year= " + year + ", price= " + price + ", color= " + color
                + ", quantity= " + quantity;
    }

}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("M10", "Suzuki", 2020, 3000000, "black", 80);
        System.out.println("Info: " + car.toString());

        int count = 20;
        car.sell(count);
        System.out.println("Info: " + car.toString());

        String model = "S12";
        car.setModel(model);
        System.out.println("Info: " + car.toString());

        String brand = "Honda";
        car.setBrand(brand);
        System.out.println("Info: " + car.toString());

        String color = "white";
        car.setColor(color);
        System.out.println("Info: " + car.toString());
    }

}