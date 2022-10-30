import java.util.*;

class Person {
  String name, address, phoneNumber, emailAddress;

  Person(String name, String address, String phoneNumber, String emailAddress) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }
}

class Student extends Person {
  final String status;

  Student(String name, String address, String phoneNumber, String emailAddress, String status) {
    super(name, address, phoneNumber, emailAddress);
    this.status = status;
  }

  public String toString() {
    return "Student\nName :" + name + "\nAddress :" + address + "\nPhone number :" + phoneNumber
        + "\nEmail Address :" + emailAddress + "\nStatus :" + status;

  }

}

class Employee extends Person {
  int office, salary;
  MyDate dateHired;

  Employee(String name, String address, String phoneNumber, String emailAddress, int office, int salary,
      MyDate dateHired) {
    super(name, address, phoneNumber, emailAddress);
    this.office = office;
    this.salary = salary;
    this.dateHired = dateHired;
  }
}

class Faculty extends Employee {
  String officeHours, rank;

  Faculty(String name, String address, String phoneNumber, String emailAddress, int office, int salary,
      MyDate dateHired, String officeHours, String rank) {
    super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
    this.officeHours = officeHours;
    this.rank = rank;
  }

  public String toString() {
    return "Faculty\nName :" + name + "\nAddress :" + address + "\nPhone number :" + phoneNumber
        + "\nEmail Address :" + emailAddress + "\nOfficer number" + office + "\nSalary :" + salary
        + "\nDate :" + dateHired.getDate() + "\nHours :" + officeHours + "\nRank :" + rank;
  }
}

class Staff extends Employee {
  String title;

  Staff(String name, String address, String phoneNumber, String emailAddress, int office, int salary,
      MyDate dateHired, String title) {
    super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
    this.title = title;
  }

  public String toString() {
    return "Staff\nName :" + name + "\nAddress :" + address + "\nPhone number :" + phoneNumber + "\nEmail Address :"
        + emailAddress + "\nOfficer number :" + office + "\nSalary :" + salary + "\nDate :"
        + dateHired.getDate() + "\nTitle :" + title;
  }
}

class MyDate {
  private String dateHired;

  public MyDate(String dateHired) {
    this.dateHired = dateHired;

  }

  public String getDate() {
    return dateHired;
  }
}

public class TestDriver {
  public static void main(String args[]) {
    String name, address, phone, email;
    Scanner s = new Scanner(System.in);
    System.out.println("What type of object you want??");
    System.out.println("1.Student\n2.Faculty\n3.Staff\nEnter their corresponding number(1 or 2 or 3)");
    int op = s.nextInt();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name :");
    name = sc.nextLine();
    System.out.println("Enter Address :");
    address = sc.nextLine();
    System.out.println("Enter phone number :");
    phone = sc.nextLine();
    System.out.println("Enter mail address :");
    email = sc.nextLine();

    switch (op) {

      case 1:
        System.out.println("Enter student status");
        String status = sc.nextLine();
        Student st = new Student(name, address, phone, email, status);
        System.out.println(st.toString());
        break;
      case 2:
        System.out.println("Enter office number");
        int office = s.nextInt();
        System.out.println("Enter salary");
        int salary = s.nextInt();
        System.out.println("Enter Date");
        String dateHired = sc.nextLine();
        MyDate dt = new MyDate(dateHired);
        System.out.println("Enter number of officeHours:");
        String hrs = sc.nextLine();
        System.out.println("Enter Rank :");
        String rank = sc.nextLine();
        Faculty f = new Faculty(name, address, phone, email, office, salary, dt, hrs, rank);
        System.out.println(f.toString());
        break;
      case 3:
        System.out.println("Enter office number");
        int office_s = s.nextInt();
        System.out.println("Enter salary");
        int salary_s = s.nextInt();
        System.out.println("Enter Date");
        String date_s = sc.nextLine();
        MyDate dt_s = new MyDate(date_s);
        System.out.println("Enter title of staff");
        String title = sc.nextLine();
        Staff staff = new Staff(name, address, phone, email, office_s, salary_s, dt_s, title);
        System.out.println(staff.toString());
        break;
    }

  }
}
