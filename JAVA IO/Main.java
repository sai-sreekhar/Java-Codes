import java.io.FileInputStream;

public class Main {

  public static void main(String args[]) {

     try {
        FileInputStream input = new FileInputStream("input.txt");

        System.out.println("Data in the file: ");

        // Reads the first byte
        int i = input.read();
        String res = "";

       while(i != -1) {

           // Reads next byte from the file
           res += (char)i;
           i = input.read();
           
        }
        input.close();
        System.out.println(res);
     }

     catch(Exception e) {
        e.getStackTrace();
     }
  }
}
