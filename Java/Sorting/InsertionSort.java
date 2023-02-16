import java.util.*;

public class InsertionSort {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
public static void main(String[] args) {
int[] arr = {7,6,8,9,4,2,1};

for(int i=0;i<arr.length;i++){
    int current = arr[i];   
    int j= i-1;
    while(j>=0 && current<arr[j]){
      arr[j+1] = arr[j];
      j--;
    }
    arr[j+1]=current;
}
printArray(arr);
}    
}
