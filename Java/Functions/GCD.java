import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        sc.close();
        System.out.println("The gcd of "+x+" and "+y+" is :" +gcd(x, y));
    }
    public static int gcd(int a, int b) {
       while(a!=b){
            if(a>b){
                a= a-b;
            }
            else{
                b=b-a;
            }    
        }
        
        return b;
    }
       
}

