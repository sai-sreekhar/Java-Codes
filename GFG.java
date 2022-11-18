import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the String: ");
        String inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isDigit(inputString.charAt(i))
                    && !Character.isLetter(inputString.charAt(i))
                    && !Character.isWhitespace(inputString.charAt(i))) {
                count++;
            }
        }

        if (count == 0)
            System.out.println(
                    "No Special Characters found.");
        else
            System.out.println(
                    "String has Special Characters\n" + count + " "
                            + "Special Characters found.");

        try {
            String[] updatedString = inputString.replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .split(",");

            int[] arr = new int[updatedString.length];

            for (int i = 0; i < updatedString.length; i++) {
                arr[i] = Integer.valueOf(updatedString[i]);
            }

            System.out.print("String : " + inputString);

            System.out.print("\nInteger array : "
                    + Arrays.toString(arr));

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
