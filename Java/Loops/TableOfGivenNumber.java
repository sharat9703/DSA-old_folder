import java.util.*;

public class TableOfGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int number = input.nextInt();
         input.close();
          for(int i= 1; i<=10;i++){
            System.out.println(number+" x "+i+" = "+number*i);
          }
    }
}
