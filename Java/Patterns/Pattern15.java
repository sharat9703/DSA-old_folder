//diamond pattern
public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        // upper part
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower part
        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
   *      i=1     3 spaces  => n-i   |   1 star =>  2*i-1
  ***     i=2     2 spaces  => 4-2   |   3 star =>  2*2-1
 *****    i=3     1 space   => 4-3   |   5 star =>  2*3-1
*******   i=4     0 space   => 4-4   |   7 star =>  2*4-1
*******   
 *****
  ***
   *

 */