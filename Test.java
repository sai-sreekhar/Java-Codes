import java.util.*;
import java.io.*;

class Stringf {
    public static void rev(String str) {
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1.reverse();
        System.out.println(input1);

    }
}

public class Test {

    public static void main(String[] args) {
        try {
            final long ex4;
            final float ex5;

            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter first number");
            float user = myObj.nextFloat();
            System.out.print("Enter second number");
            float sec = myObj.nextFloat();
            float ex6 = user / sec;
            System.out.print("remainder is" + ex6);
            Stringf.rev("my name is khan");

            FileInputStream fin = new FileInputStream("testout.txt");
            int i = fin.read();
            System.out.print((char) i);
            fin.close();
            myObj.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
