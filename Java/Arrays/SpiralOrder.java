import java.util.*;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The spiral order is :\n");
        int row_start = 0;
        int row_end = row-1;
        int col_start = 0;
        int col_end = col-1;

        while(row_start<=row_end && col_start<=col_end){
////////////////////  1
            for(int col_ = col_start;col_<=col_end;col_++){
                System.out.print(arr[row_start][col_]+" ");
            }
            row_start++;
///////////////////  2
            for(int row_=row_start;row_<=row_end;row_++){
                System.out.print(arr[row_][col_end]+" ");
            }
            col_end--;
//////////////////  3
            for(int col_=col_end;col_>=col_start;col_--){
                System.out.print(arr[row_end][col_]+" ");
            }
           row_end--;
/////////////////  4
            for(int row_ = row_end;row_>=row_start;row_--){
                System.out.print(arr[row_][col_start]+" ");
            }           
            col_start++;
            System.out.println();
        }
    }
}
