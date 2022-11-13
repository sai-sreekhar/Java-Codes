import java.io.*;

class file {
    public static void main(String args[]) {
        try {
            Stack inputFile = new Stack("rishab.txt");
            Stack outputFile = new Stack("out.txt");
            FileReader fis = null;
            FileWriter fos = null;
            fis = new FileReader(inputFile);
            fos = new FileWriter(outputFile);
            int count;
            while ((count = fis.read()) != -1) {
                fos.write(count);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Test: " + e);
        } catch (IOException e) {
            System.err.println("File Test: " + e);
        }
    }
}