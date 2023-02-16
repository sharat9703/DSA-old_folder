public class QuickSort{
    public static void main(String[] args) {
           int[] arr ={12,1,43,23,54,59,33};
               quicksort(arr);
    }
    public static void quicklysort(int[] A,int l,int r) {
        if(r-l<=1){
            return;  
        }
        int yellow = l+1;

        for(int green = l+1; green < r;green++){
            if(A[green]<=A[l]){
                int temp = A[green];
                A[green] = A[yellow];
                A[yellow] = temp;
                yellow++;
            }
        }
        int temp = A[yellow-1];
        A[yellow-1] = A[l];
        A[l] = temp;
        quicklysort(A,l, yellow-1);
        quicklysort(A, yellow, r);

    }
    public static void quicksort(int[] l) {
        quicklysort(l, 0, l.length);
        for(int i =0;i<l.length;i++){
            System.out.print(l[i]+" ");
        }
    }
}