import java.util.*;

public class EvenNumbersTillN {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
System.out.println("Enter the number: ");    
        int N = input.nextInt();
        input.close();
        for(int i=1;i<=N;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

/* for(;;){
    System.out.println("Sharat is great!!");
}
 */

    }
    
}
