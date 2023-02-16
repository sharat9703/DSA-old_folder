public class Pattern5 {
    public static void main(String[] args) {
       /*
       for(int i=0;i<5;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int j=0;j<2;j++){
            for(int k=0;k<5;k++){
                if(k==0 || k==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int l=0;l<5;l++){
            System.out.print("* ");
        }
        */ 
        int row = 4;
        int col = 5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
             if(i==1||j==1||i==row||j==col){
               System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
            }
            System.out.println();
        }
    }
}
/*

 * * * * *
 *       *
 *       *
 * * * * *

 */