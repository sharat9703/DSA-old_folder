//print fibonacci terms

public class Recursion2 {
public static void main(String[] args) {
    int n =7;
    int a  =0;
    int b=1;
    System.out.println(a);
    System.out.println(b);
    fibonacci(n-2,a,b);

}   
public static void fibonacci(int n,int a,int b) {
    if(n==0){
        return;
    }
        int c= a+b;
        System.out.println(c);
    fibonacci(n-1, b, c);
} 
}
