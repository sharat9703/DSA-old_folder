
import java.util.*;

public class MergeSort{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter size of array A: ");
        int sizeA = sc.nextInt();

        int[] A = new int[sizeA];
 
        for(int i =0;i<sizeA;i++){
          A[i] = sc.nextInt();
        }
        int[] ans = mergesort(A, 0, A.length);
          for(int i=0;i<ans.length;i++){
            System.out.println(ans+" ");
          }
    }
    public static int[] merge(int[] a,int[] b) {

        int m = a.length, n = b.length, i=0, j=0;
        int[] C = new int[m+n];
        while(i+j < m+n){
           
            if(i==m){
              C[j]=b[j];
              j++;
            }
            else if(j==n){
                C[i]=a[i];
                i++;
            }
            else if(a[i]< b[j]){
                C[i]=a[i];
                i++;
            }
            else if(a[i]> b[j]){
                C[j]=b[j];
                j++;
            }
        }
        return C;
    }
    public static int[] mergesort(int[] A,int l,int r) {
        if(r-l<=1){
            return A;
        }
        else{
            int mid = (l+r)/2;
            int[] L = mergesort(A, l, mid);
            int[] R = mergesort(A, mid, r);
            
            return merge(L,R);
        }
        
    }
}














