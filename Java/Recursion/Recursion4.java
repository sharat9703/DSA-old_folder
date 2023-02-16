//print nth fibonacci term

public class Recursion4 {
    public static int fib(int n) {
       int fibo;
        if(n<=1){
          fibo=0;
          return fibo;
        }
        else if(n==2){
            fibo = 1;
            return fibo;
        }
        else{
            fibo = fib(n-1)+fib(n-2);
            return fibo;
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(0));
    }
}
