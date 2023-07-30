import java.util.*;

class MyException extends Exception {
    MyException(String str) {
        super(str);
    }

    public String toString()
    {
        return "Multiplication of matrices not possible";
    }
}

public class Q3L3 {
    public static void main(String[] args) {
        int r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        sc.close();
        try {
            if (c1 != r2) {
                MyException me = new MyException("Multiplication of matrices not possible");
                throw me;
            }
        } catch (MyException e) {
            System.out.println(e);
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}