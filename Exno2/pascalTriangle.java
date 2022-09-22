import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            StringBuilder space = new StringBuilder();
            for (int j = 0; j < height - i; j++) {
                space.append(" ");
            }
            System.out.print(space);
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print(space);
            System.out.print('\n');
        }
        sc.close();
    }
}
