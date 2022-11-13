import java.io.*;

public class sam1 {
    public static void main(String[] args) throws Exception {
        InputStream imputStream = System.in;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sam1.txt"));

        int letter;

        while ((letter = imputStream.read()) != -1 && letter != '!') { // using ! to break
            bufferedWriter.write((char) letter);
            bufferedWriter.flush();
        }

        FileInputStream fileInputStream = new FileInputStream("sam1.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wordCount = 0;
        int characterCount = 0;

        while ((line = bufferedReader.readLine()) != null) {

            characterCount += line.length();
            String words[] = line.split("\\s+");
            wordCount += words.length;
        }

        System.out.println("Total no of words: " + wordCount);
        System.out.println("Total number of characters: " + characterCount);

    }
}
