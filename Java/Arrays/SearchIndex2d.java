import java.util.*;

public class SearchIndex2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the Elements:\n");
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter the element whose index to be found : ");
        int m = sc.nextInt();
        sc.close();
        System.out.println();
        /*for(int i=0;i<row;i++){ //to print the matrix 
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
if(arr[i][j]==m){
    System.out.println("The element "+m+" found at ["+i+"]["+j+"]");
}
    }
}
    }
}
