import java.util.*;

class AgeNotWithInRangeException extends Exception {
    public String toString() {
        return ("Given Age is not between 15 and 21. Please ReEnter the Age");
    }
}

class NameNotValidException extends Exception {
    public String toString() {
        return ("Given Name is not Valid(has special characters). Please ReEnter the Name");
    }
}

class LessSalaryException extends Exception {
    public String toString() {
        return ("Given Salary is not more than 20,000. Please ReEnter the Salary");
    }
}

class Employee {
    int salary, age;
    String name, profession;

    Employee() {
        salary = 0;
        name = null;
        age = 0;
        profession = null;
    }

    Employee(int salary, String name, int age, String profession) {
        this.profession = profession;
        int len, isValidChar = 0;
        len = name.length();
        for (int i = 0; i < len; i++) {
            char ch;
            ch = name.charAt(i);
            if (ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z')
                isValidChar = 1;
        }

        try {
            if (isValidChar == 1)
                throw new NameNotValidException();
            else
                this.name = name;
        } catch (NameNotValidException e) {
            System.out.println(e);
        }

        try {
            if (age >= 15 && age <= 21)
                this.age = age;
            else
                throw new AgeNotWithInRangeException();
        } catch (AgeNotWithInRangeException e) {
            System.out.println(e);
        }

        try {
            if (salary >= 20000) {
                this.salary = salary;
            } else {
                throw new LessSalaryException();
            }
        } catch (LessSalaryException e) {
            System.out.println(e);
        }
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age + " Profession: " + profession + " Salary " + salary);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        System.out.println("Enter the Profession");
        String profession = sc.nextLine();
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        System.out.println("Enter the Salary");
        int salary = sc.nextInt();

        Employee s = new Employee(salary, name, age, profession);
        s.display();
        sc.close();
    }
}