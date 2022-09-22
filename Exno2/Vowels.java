import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String lowerCasedStr = str.toLowerCase();
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (lowerCasedStr.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }

        System.out.println("Vowels count: " + count);
        sc.close();
    }
}
