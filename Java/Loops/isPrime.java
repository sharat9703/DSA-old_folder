import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
           if(num%i==0){
           isPrime=false;
           break;
        }
        }
        
        switch(num){
            case 0:
             System.out.println("0 is neither prime nor composite");
             break;
            case 1:
            System.out.println("1 is neither prime nor composite");
            break;
            default:
            System.out.println("Is "+num+" Prime ? => "+isPrime); 
        }
    }
}
