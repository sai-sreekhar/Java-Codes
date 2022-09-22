import java.util.Scanner;

public class sumDivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0, val = 2; i <= n; i++, val += 2) {
            if (val % 3 == 0)
                sum += val;

        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
