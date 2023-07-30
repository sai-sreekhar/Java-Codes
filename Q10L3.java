import java.util.*;

public class Q10L3 {
    public static void main(String[] args) {
        String s;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        s = input.nextLine();
        String arr[] = s.split(" ");
        int res[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            try {
                int temp = Integer.parseInt(arr[i]);
                res[i] = temp;
            } catch (NumberFormatException a) {
                res[i] = -1;
            }
        }
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }

        input.close();
    }
}