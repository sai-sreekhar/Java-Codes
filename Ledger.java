import java.util.*;
import java.io.*;

public class Ledger {

    public static void main(String args[]) {

        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Enter the amount at begining of day:");
            double begininngAmount = inputScanner.nextDouble();
            System.out.println("Enter the amount at end of day:");
            double endAmount = inputScanner.nextDouble();
            System.out.println("Enter the name of file:");
            String file = inputScanner.next();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(fileReader);
            String s;
            while ((s = bufferedreader.readLine()) != null) {
                String[] words = s.split("[\\s']");
                if (words[2].equals("P"))
                    begininngAmount -= Double.parseDouble(words[1]);
                else if (words[2].equals("R"))
                    begininngAmount += Double.parseDouble(words[1]);
            }

            if (begininngAmount == endAmount)
                System.out.println("Your data is matching with input");

            else
                System.out.println("Your data is not matching with input");
            inputScanner.close();
            fileReader.close();
            bufferedreader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
