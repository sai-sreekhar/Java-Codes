import java.util.*;

public class bmiHealth {
    private static Person anyPerson;

    public static void main(String[] args) {
        createPersonObject();
        showBMI();
    }

    public static void createPersonObject() {
        String firstName;
        String lastName;
        double height;
        double weight;
        Scanner sc = new Scanner(System.in);
        System.out.print("first name: ");
        firstName = sc.nextLine();

        System.out.print("last name: ");
        lastName = sc.nextLine();

        System.out.print("weight (in kg): ");
        weight = sc.nextDouble();

        System.out.print("height (in meter): ");
        height = sc.nextDouble();

        anyPerson = new Person(firstName, lastName, height, weight);
        sc.close();
    }

    public static void showBMI() {
        System.out.println(anyPerson.toString());
        double BMI = anyPerson.calculateBMI();
        System.out.println("BMI = " + BMI);
        String healthStatus = anyPerson.determineHealth();
        System.out.println("health status: " + healthStatus);
        if (!healthStatus.equals("healthy")) {
            double recommendedWeight = anyPerson.recommendedWeight();
            System.out.println("recommended weight: " + recommendedWeight + "kg");
        }
    }
};

class Person {
    String lastName;
    String firstName;
    double heightMeters;
    double weightKg;

    public Person(String f, String l, double h, double w) {
        firstName = f;
        lastName = l;
        heightMeters = h;
        weightKg = w;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getHeightMeters() {
        return heightMeters;
    }

    public double getWeightKgs() {
        return weightKg;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public void setHeightMeters(double h) {
        heightMeters = h;
    }

    public void setWeightKgs(double w) {
        weightKg = w;
    }

    public double calculateBMI() {
        return (weightKg / (heightMeters * heightMeters));
    }

    public String determineHealth() {
        String healthStatus = "";

        double BMI = calculateBMI();

        if (BMI < 18.5) {
            healthStatus = "underweight";
        } else if (BMI >= 18.5 && BMI < 25) {
            healthStatus = "healthy";
        } else if (BMI >= 25 && BMI < 40) {
            healthStatus = "overweight";
        } else {
            healthStatus = "obese";
        }

        return healthStatus;
    }

    public double recommendedWeight() {
        double optimumWeight = 0;
        optimumWeight = (25 * Math.pow(heightMeters, 2));
        return optimumWeight;
    }

    public String toString() {
        return (firstName + " " + lastName + " -- [" + weightKg + " kg " + heightMeters + " meters]");
    }
};