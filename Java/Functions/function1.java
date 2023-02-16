//package Functions;
import java.util.*;

public class function1 {
    public static void main(String[] args) {
        //factorial
        Scanner sc = new Scanner(System.in);
        float k = sc.nextFloat();
        sc.close();
       factorial(k);
    }
    public static void factorial(float n){
        float factorial=1;
        if(n<0){
            System.out.println("Invalid");
        }
        else if(n==0){
            factorial=1;
        }
        else{
            for(float i=n;i>=1;i--){
                factorial = factorial * i;
            }    
        }
        
        System.out.println("factorial is: "+factorial);
    }
}
