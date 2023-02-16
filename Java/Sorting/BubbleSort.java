import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
            int[] arr = { 13, 221, 43, 764, 345, 986, 137 };
            int n = arr.length;
            
        // time complexity is O(n^2)
        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
