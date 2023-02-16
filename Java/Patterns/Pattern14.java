//butterfly pattern
public class Pattern14{
    public static void main(String[] args) {
        int n=4;
        // upper part
        for(int i=1;i<=n;i++){
           //left part
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           //spaces
           for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
           }
           //right part
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--){
            //left part
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
             System.out.print(" ");
            }
            //right part
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }
            System.out.println();
         }
    }
}
/*
 
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * * 
* * *     * * *
* *         * *
*             *

 */