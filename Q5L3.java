import java.util.*;

public class Q5L3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        int[] flag = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    flag[i] = 1;
                    break;
                }
            }
        }

        for (int j = 0; j < str.length(); j++) {
            if (flag[j] != 1) {
                System.out.println(str.charAt(j));
                break;
            }
        }

        input.close();
    }
}