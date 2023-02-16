// Pascal's triangle
public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("1 ");
                }
                else{
                      System.out.print(i-1+" ");
                }
            }
            System.out.println();
        }
    }
}
/*         
 *        1
 *      1  1    
 *    1  2  1
 *   1  3  3  1
 * 1  4  6  4  1
 */

 /*
    1   
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1        
*/