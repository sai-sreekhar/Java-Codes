import java.util.Scanner;

public class removeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the mask string: ");
        String maskStr = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < maskStr.length(); j++) {
                if (str.charAt(i) == maskStr.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                res.append(str.charAt(i));
            }
        }

        System.out.println("Result: " + res);
        sc.close();
    }
}
