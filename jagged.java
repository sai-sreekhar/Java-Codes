import java.util.Scanner;

class jagged {
    String jaggedArray[][];
    int presentIdx = -1;

    jagged() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row = sc.nextInt();
        jaggedArray = new String[row][];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter no of columns: ");
            int col = sc.nextInt();
            sc.nextLine();
            jaggedArray[i] = new String[col];
            for (int j = 0; j < col; j++) {

                System.out.println("Enter the string: ");
                String s;
                s = sc.nextLine();

                if (search(s, jaggedArray[i])) {
                    jaggedArray[i][j] = "duplicate";
                } else {
                    for (int k = j; k >= 1; k--) {
                        jaggedArray[i][k] = jaggedArray[i][k - 1];
                    }
                    jaggedArray[i][0] = s;
                }
            }
        }

        sc.close();
    }

    void displayJaggedArray() {
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("The Strings in row " + (i + 1));
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();

        }
    }

    void reverseJaggedArray() {
        for (int i = 0; i < jaggedArray.length; i++) {
            String[] reversedArray;
            reversedArray = reverseRow(jaggedArray[i]);
            jaggedArray[i] = reversedArray;
        }
    }

    void searchAtJaggedArray() {
        System.out.println("The String with at second position are: ");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (jaggedArray[i][j].charAt(1) == 'a' && jaggedArray[i][j].charAt(2) == 't') {
                    System.out.print(jaggedArray[i][j] + " ");
                }
            }
        }
    }

    boolean search(String s, String arr[]) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == null) {
                break;
            }
            if (arr[j].equals(s)) {
                return true;
            }
        }

        return false;
    }

    String[] reverseRow(String row[]) {
        int j = row.length;
        String[] reversedRow = new String[j];

        for (int i = 0; i < j; i++) {
            reversedRow[j - 1] = row[i];
            j = j - 1;
        }
        return reversedRow;
    }

    public static void main(String[] args) {
        jagged jaggedArrObj = new jagged();
        jaggedArrObj.displayJaggedArray();
        // jaggedArrObj.reverseJaggedArray();
        // jaggedArrObj.displayJaggedArray();
        jaggedArrObj.searchAtJaggedArray();
    }

}