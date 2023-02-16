import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int z = sc.nextInt();
        fib(z);
        sc.close();
    }
    public static void fib(int n) {
       
        int fib1=0;
        int fib2=1;
        System.out.print(fib1+" ");
        for(int i=1;i<n;i++){
            System.out.print(fib2+" ");
            int next = fib1 + fib2;
            fib1=fib2;
            fib2=next;
        }

    }
}
/*
 * 1 1 2 3 5 8 13 
 */