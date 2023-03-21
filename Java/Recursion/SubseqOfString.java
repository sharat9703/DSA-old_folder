public class SubseqOfString {
    public static void subseq(String str,int idx,String newStr) {
        if(idx==str.length()){
            System.out.print(newStr+" ");
            return;
        }
        char currChar = str.charAt(idx);
        //to be 
        subseq(str, idx+1, newStr+currChar);

        //not to be
        subseq(str, idx+1, newStr);

    }
    public static void main(String[] args) {
     String str= "abc";
     subseq(str, 0, "");   
    }
    
}
