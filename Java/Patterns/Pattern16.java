//print hollow butterfly
public class Pattern16 {
    /**
     * @param n 
     */
    public static void main(String[] args) {
       int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if(j==1||j==i){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    for(int j=1;j<=2*(n-i);j++){
System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
    if(j==1||j==i){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
}
    System.out.println();
}
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        if(j==1||j==i){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    for(int j=1;j<=2*(n-i);j++){
System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
    if(j==1||j==i){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
}
    System.out.println();
}
    }
}
/*
                              big spaces       stars   
*        *    i=1               j=2*(n-i)        1  (i=1,j=1=i)        
**      **    i=2                                2  (j=1,j=i=2)       
* *    * *    i=3                                2  (j=1,j=i=3)
*  *  *  *    i=4                                2
*   **   *    i=5                                2
*   **   * 
*  *  *  *
* *    * *
**      **
*        *


*/