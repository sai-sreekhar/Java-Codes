
import java.util.Arrays;
import java.util.Random;

public class SortAnalasys {
    static void Insertionsort(int arr[], int length) {
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void selctionSort(int arr[], int length) {
        for (int i = 0; i < length - 1; i++) {
            int min_pointer = i;
            int min = arr[i];
            for (int j = i + 1; j < length; j++) {
                if (arr[min_pointer] > arr[j]) {
                    min_pointer = j;
                    min = arr[j];
                }
            }
            if (min_pointer != i) {
                int temp = arr[i];
                arr[i] = min;
                arr[min_pointer] = temp;
            }
        }
    }

    static void bubleSort(int arr[], int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int left[] = new int[n1 + 1], right[] = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];

        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        left[n1] = right[n2] = Integer.MAX_VALUE;
        int i, j, k;
        i = j = 0;
        k = l;
        while (k <= r) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
    }

    static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static int partition(int arr[], int l, int r) {
        int temp = arr[r];
        int p = l - 1;
        for (int i = l; i < r; i++) {
            if (arr[i] < temp) {
                p++;
                int o = arr[i];
                arr[i] = arr[p];
                arr[p] = o;
            }
        }
        p++;
        arr[r] = arr[p];
        arr[p] = temp;
        return p;
    }

    static void quicksort(int arr[], int l, int r) {
        if (l < r) {
            int q = partition(arr, l, r);
            quicksort(arr, l, q - 1);
            quicksort(arr, q + 1, r);
        }
    }

    static void MaxHeapify(int arr[], int length, int index) {
        int l = 2 * index + 1;
        int r = 2 * index + 2;
        int max_index = index;
        if (l < length && arr[l] > arr[max_index]) {
            max_index = l;
        }
        if (r < length && arr[r] > arr[max_index]) {
            max_index = r;
        }
        if (max_index != index) {
            int temp = arr[max_index];
            arr[max_index] = arr[index];
            arr[index] = temp;
            MaxHeapify(arr, length, max_index);
        }
    }

    static void MaxHeap(int arr[], int length) {
        for (int i = length / 2; i >= 0; i--) {
            MaxHeapify(arr, length, i);
        }
    }

    static void heapSort(int arr[], int length) {
        MaxHeap(arr, length);
        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            MaxHeapify(arr, i, 0);
        }
    }

    static void countSort(int arr[], int length) {
        int max = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int ar[] = new int[max + 1];
        int output[] = new int[length];
        for (int i = 0; i < max + 1; i++) {
            ar[i] = 0;
        }
        for (int i = 0; i < length; i++) {
            ar[arr[i]]++;
        }
        for (int i = 1; i < ar.length; i++) {
            ar[i] += ar[i - 1];

        }
        for (int i = output.length - 1; i >= 0; i--) {
            output[ar[arr[i]] - 1] = arr[i];
            ar[arr[i]]--;
        }
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    static int get(int j) {
        switch (j) {
            case 0:
                return 10;
            case 1:
                return 100;
            case 2:
                return 1000;
            case 3:
                return 10000;
            case 4:
                return 100000;
            case 5:
                return 200000;
        }
        return 0;
    }

    static long[] buble() {
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            int size = get(i);
            int data[] = new int[size];
            Random rd = new Random();
            for (int j = 0; j < size; j++) {
                data[j] = rd.nextInt(1000);
            }
            long start = System.nanoTime();
            bubleSort(data, size);
            long end = System.nanoTime();
            arr[i] = end - start;
        }
        return arr;
    }

    static long[] selction() {
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            int size = get(i);
            int data[] = new int[size];
            Random rd = new Random();
            for (int j = 0; j < size; j++) {
                data[j] = rd.nextInt(1000);
            }
            long start = System.nanoTime();
            selctionSort(data, size);
            long end = System.nanoTime();

            arr[i] = end - start;
        }
        return arr;
    }

    static long[] insertion() {
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            int size = get(i);
            int data[] = new int[size];
            Random rd = new Random();
            for (int j = 0; j < size; j++) {
                data[j] = rd.nextInt(1000);
            }
            long start = System.nanoTime();
            Insertionsort(data, size);
            long end = System.nanoTime();
            arr[i] = end - start;
        }
        return arr;
    }

    static long[] quick() {
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            int size = get(i);
            int data[] = new int[size];
            Random rd = new Random();
            for (int j = 0; j < size; j++) {
                data[j] = rd.nextInt(1000);
            }
            long start = System.nanoTime();
            quicksort(data, 0, size - 1);
            long end = System.nanoTime();
            arr[i] = end - start;
        }
        return arr;
    }

    static long[] mergeestion() {
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            int size = get(i);
            int data[] = new int[size];
            Random rd = new Random();
            for (int j = 0; j < size; j++) {
                data[j] = rd.nextInt(1000);
            }
            long start = System.nanoTime();
            mergesort(data, 0, size - 1);
            long end = System.nanoTime();

            arr[i] = end - start;
        }
        return arr;
    }

    static long[] heap() {
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            int size = get(i);
            int data[] = new int[size];
            Random rd = new Random();
            for (int j = 0; j < size; j++) {
                data[j] = rd.nextInt(1000);
            }
            long start = System.nanoTime();
            heapSort(data, size);
            long end = System.nanoTime();
            arr[i] = end - start;
        }
        return arr;
    }

    static long[] count() {
        long arr[] = new long[6];
        for (int i = 0; i < 6; i++) {
            int size = get(i);
            int data[] = new int[size];
            Random rd = new Random();
            for (int j = 0; j < size; j++) {
                data[j] = rd.nextInt(1000);
            }
            long start = System.nanoTime();
            countSort(data, size);
            long end = System.nanoTime();
            arr[i] = end - start;
        }
        return arr;
    }

    public static void main(String arg[]) {
        long arr[][] = new long[7][6];
        arr[4] = quick();
        arr[0] = buble();
        arr[1] = selction();
        arr[2] = insertion();
        arr[3] = mergeestion();
        arr[5] = heap();
        arr[6] = count();
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
