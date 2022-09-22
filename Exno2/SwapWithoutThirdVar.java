import java.util.Scanner;

public class SwapWithoutThirdVar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After swap: " + a + " " + b);
        sc.close();
    }
}
