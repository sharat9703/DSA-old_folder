import java.util.*;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    greaterNumber(a,b);
    }
    public static void greaterNumber(int x, int y) {
       // int z = Math.max(x, y);
       int z;
       if(x>y){
        z = x;
       }
       else if(y>x){
        z=y;
       }
       else{
        z=x;
       }
       
        System.out.println("The greater number is : "+z); 
    }
}
