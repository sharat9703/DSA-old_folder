import java.util.*;

public class SumofFirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = in.nextInt();
        in.close();
        int sum =0;
        for(int i=1;i<=N;i++){
           sum+=i;
        }
        System.out.println("the sum is : "+sum);
    }
}
