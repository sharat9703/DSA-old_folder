import java.lang.reflect.Array;

public class Recursion9 {
    public static void main(String[] args) {
        int[] ar = { 13, 221, 43, 764, 345, 986, 137 };
        for (int i = 0; i < ar.length-1 ; i++) {//simple bubble sort
            for (int j = 0; j < ar.length - i-1 ; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        System.out.println("Query is found at index "+binarySearch(0, ar.length -1, ar, 221));
    }

    public static int binarySearch(int l, int r, int[] arr, int query) {
        
        if (r >= l) {

            int mid = (l+r) / 2;
            if (arr[mid]==query) {
                return mid;
            }

            if (arr[mid]<query) {
                return binarySearch(mid + 1, r, arr, query);

            } else {
                return binarySearch(l, mid - 1, arr, query);
            }
         
        }
            return -1;
    }
}
