import java.util.*;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        String[] arr = new String[n];
        int toLength =0;
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
            toLength+=arr[i].length();
        }
        System.out.println(toLength);
        sc.close();
    }
}
