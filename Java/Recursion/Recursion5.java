// x^n(stack height n)

public class Recursion5 {
    public static int pow(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
    
            return x * pow(x, n-1);
        
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
}
