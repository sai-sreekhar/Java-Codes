public class BinarySearch {
  public static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++)
      for (int j = 0; j < n - i - 1; j++)
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
  }

  public static int binarySearch(int arr[], int x) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;

      if (arr[m] == x)
        return m;

      if (arr[m] < x)
        l = m + 1;

      else
        r = m - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 2, 135, 16, 8, 28, 4, 9 };
    int key = 4;
    bubbleSort(arr);
    int res = binarySearch(arr, key);
    if (res == -1) {
      System.out.println("Not Found");
      return;
    }
    System.out.println("The value " + key + " is found.");
  }
}