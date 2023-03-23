//count total paths in a maze to move from (0,0) to (n,m). Constraints => YOu can only move right or downwards  

public class CountTotalPaths {
public static int countpaths(int i,int j,int n,int m) {
    //move down
   int downpaths = countpaths(i+1, j, n, m);
    //move right
    int righpaths = countpaths(i, j+1, n, m);

    
}
    public static void main(String[] args) {
         int m = 3, n=3;
         countpaths(0, 0, n, m);
 }   
}
