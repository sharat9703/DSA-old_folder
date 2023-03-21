import java.util.*;
public class Prob1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++){
         String s = read.next();
         if(s.toLowerCase().charAt(0)=='b') {
            System.out.println("Brooklyn");
        }
    }
        read.close();
    }
}
