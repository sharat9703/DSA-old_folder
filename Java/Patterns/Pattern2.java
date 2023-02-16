import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();

        for(int i=0;i<num;i++){
            for(int j =num-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
