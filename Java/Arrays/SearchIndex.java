//enter elements in an array and try to find the index of a given array element
//Linear search
import java.util.*;

public class SearchIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose index is to be found: ");
        int m = sc.nextInt();
        int index = -1;
        for(int i =0;i<n;i++){
            if(arr[i]==m){
                index = i;
                break;
            }
        }
        if(index >= 0 ){
            System.out.println("The index of element is: "+index);
        }
        else{
            System.out.println("The element doesn't exist!");
        }
       sc.close();
    }
}