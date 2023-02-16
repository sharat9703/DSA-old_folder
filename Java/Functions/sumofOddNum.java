import java.util.*;

public class sumofOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        sumOfOddNum(n);
    }

    public static void sumOfOddNum(int m) {
        int sum = 0;
        for (int i = 0; i <= m; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of odd numbers fro 1 to n is: " + sum);
    }
}
