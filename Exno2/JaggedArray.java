public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[4][];
        arr[0] = new int[] { 78, 85 };
        arr[1] = new int[] { 81, 89, 90, 76 };
        arr[2] = new int[] { 54, 67, 78 };
        arr[3] = new int[] { 56, 87, 54, 45, 78 };

        System.out.println("Marks Sheet 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
