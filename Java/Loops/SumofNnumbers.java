import java.util.*;

public class SumofNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        
        int N = in.nextInt();
        int sum =0;
        
        int[] arr = new int[N];
        
        System.out.println("Enter the elements:\n");
        
        for(int i=0;i<N;i++){
          arr[i] = in.nextInt();
        }
        in.close();
        for(int j=0;j<N;j++){
            sum= sum+arr[j];
        }
        System.out.println("\nSum is: "+sum);
    }
}
