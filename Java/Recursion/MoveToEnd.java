public class MoveToEnd {
    public static void moveAllx(String str,int idx,int count,String newStr) {
        if(idx==str.length()){
            for(int i =1;i<=count;i++){
                newStr = newStr + "x";
            }
            
        System.out.println(newStr);
        return;
        } 
        char curChar = 'x';
         if(str.charAt(idx)!=curChar){
            newStr = newStr+str.charAt(idx);
         }
         else{
           count++;
         }
        moveAllx(str, idx+1, count, newStr);


    }
    public static void main(String[] args) {
        String str ="abdfxxdiewxxhjadxwefdhxxksjdf";
        moveAllx(str, 0, 0, "");
    }

}
