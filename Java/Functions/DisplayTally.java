import java.util.*;
public class DisplayTally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the times you want to input any number: ");
        int n = sc.nextInt();
        displayTally(n);
        sc.close();
    }
    public static void displayTally(int m) {
        Scanner sc = new Scanner(System.in);
        int pos_count =0;
        int neg_count =0;
        int zero_count=0;
        for(int i=1;i<=m;i++){
            System.out.println("Enter the number: ");
         int k = sc.nextInt();
         if(k>0){
            pos_count++;
         }
         else if(k<0){
            neg_count++;
         }
         else{
            zero_count++;
         }
        }
        System.out.println("The positive count: "+pos_count+" The negative count: "+neg_count+" The zero count: "+zero_count);
        sc.close();
    }
}
