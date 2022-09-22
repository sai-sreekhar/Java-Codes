import java.util.Scanner;
class CustomerDetails {
  int custID = 0;
  String custName = null;

  public void getdata() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the customer: ");
    custName = sc.nextLine();
    System.out.println("Enter the customer ID: ");
    custID = sc.nextInt();
  }

}

class purchase extends CustomerDetails {
  int products;
  int amount;

  public void getpurchase() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter then number of products: ");
    products = sc.nextInt();
    System.out.println("Enter the purchase amount: ");
    amount = sc.nextInt();
  }

  public boolean check() {
    if (products >= 3 && amount > 100) {
      return true;
    }

    return false;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of customers: ");
    int n = sc.nextInt();

    purchase[] p = new purchase[n];

    boolean constraintsFailed = false;
    for (int i = 0; i < n; i++) {
      p[i] = new purchase();
      p[i].getdata();
      p[i].getpurchase();

      if (p[i].check()) {
        continue;
      } else {
        constraintsFailed = true;
        break;
      }
    }

    if (constraintsFailed) {
      System.out.println(
          "Minimum 3 product should be purchased by the customer and total rate of the three products should be greater than 100");
    } else {
      display(p, n);
    }
  }

  static void display(purchase p[], int n) {

    int sum = 0;
    int prod = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("name of the customer: " + p[i].custName);
      System.out.println("No of items purchased: " + p[i].products);
      System.out.println("Purchase amount: " + p[i].amount);
    }

    for (int i = 0; i < n; i++) {
      sum = sum + p[i].amount;
      prod = prod + p[i].products;
    }

    System.out.println("Total Amount Received: " + sum);
    System.out.println("Total Number of items sold: " + prod);
  }
}