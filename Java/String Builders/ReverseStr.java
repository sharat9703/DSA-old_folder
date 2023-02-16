import java.util.*;

public class ReverseStr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String reverse = "";
        // for(int i=str.length()-1;i>=0;i--){
        // reverse+=str.charAt(i);
        // }
        // System.out.println(reverse);
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
