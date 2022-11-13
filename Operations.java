import java.io.*;

class A extends Operations {
    int f = 20;

    public void arith(int f) {
        this.add_sub();
        this.arith();
        this.f = f;
        System.out.println(f);
    }

}

public class Operations {
    public static int ex1 = 2;
    public static int ex2 = 10;
    public static int ex3 = ex2 * ex1;
    public static int ex4;
    public static int ex5;

    public void add_sub() {
        ex4 = ex1 + ex2;
        ex5 = ex1 - ex2;
    }

    public void arith() {
        System.out.print("Added the variables!!!");
    }

    public static void main(String[] args) {
        try {
            Operations m = new Operations();
            m.add_sub();
            System.out.println("10 divided by 2 is " + ex3);
            int arr[] = new int[5];
            System.out.println("5th element in array: " + arr[5]);
            FileInputStream fin = new FileInputStream("testout.txt");
            int i = fin.read();
            System.out.print((char) i);
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
