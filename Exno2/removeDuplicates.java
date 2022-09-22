import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();

        res.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                res.append(str.charAt(i));
            }
        }

        System.out.println("Result: " + res);
        sc.close();
    }
}
