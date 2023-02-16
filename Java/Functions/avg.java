
import java.util.*;
public class avg {
    public static void main(String[] args) {
        printAvg();
    }
    public static void printAvg(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int sum=0;
        int avg=0; 
        for(int i=0;i<3;i++){
            System.out.println("Enter a number");
             arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<arr.length;i++){
          sum= sum +arr[i];
     }
     avg = sum/arr.length ;
     System.out.println("The avg is: "+avg);   
    }
}
