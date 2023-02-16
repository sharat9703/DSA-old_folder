import java.util.*;
public class ZeroCoins {
    public static int[] divisors(int n) {
        
        ArrayList ans1 = new ArrayList<>(); 
        for(int i=1;i<n;i++){
            if(n%i == 0){
              ans1.add(i);
            }
        }
        int[] ans = new int[ans1.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = (int)ans1.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array A : ");
        int N = sc.nextInt();
        System.out.println("Size of Array B : ");
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        System.out.println("Input elements in array A :");
        for(int i = 0 ;i< N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Input elements in array B :");
        for(int i = 0 ;i< M;i++){
            B[i] = sc.nextInt();
        }
           ArrayList count =new ArrayList<>();
        
        for(int i=0;i<M;i++){
            
            int[] div = divisors(B[i]);
            int counter = 0;
            
            for(int j=0;j<N;j++){
                                                   //  1 2 3 4 
                for(int k=0;k<div.length;k++){//[1,2] [3,1,4,2]
                    if(A[div[k]]>=1) A[div[k]]--;                       
                }
                if(A[j] ==0) counter++;
            }
            
            count.add(counter);
        }

        System.out.println(count);
        
        
    }
}
