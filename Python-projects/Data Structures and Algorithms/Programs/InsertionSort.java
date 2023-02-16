import java.util.*;

public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {23,5,65,123,56,345,29,54};
        for(int sliceEnd = 0;sliceEnd<arr.length;sliceEnd++){
            int pos = sliceEnd;
            while(pos>0 && arr[pos]<arr[pos-1]){
                int temp = arr[pos-1];
                arr[pos-1] = arr[pos];
                arr[pos]=temp;
                pos--;
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}