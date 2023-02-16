public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
          //inner loop for spaces 1 to n-i
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
          //inner loop for i to 1  
            for(int j=i;j>=1;j--){
                System.out.print(" "+j);
            }
            //inner loop for 2 to n
            for(int j=2;j<=i;j++){
System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */