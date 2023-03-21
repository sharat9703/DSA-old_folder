///find all the unique subsequences of a string 
import java.util.*;
public class UniqueSubSeq {
    public static void uniqueSubSeq(String str, int idx,String newStr,HashSet<String> set) {
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                
                System.out.println(newStr+" ");
                set.add(newStr);
                return;
            }
        }
       char curChar = str.charAt(idx);
       //to be 
        uniqueSubSeq(str, idx+1, newStr+curChar, set);
       // to not to be
        uniqueSubSeq(str, idx+1, newStr, set);
    }
       public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSeq(str, 0, "",set); 
       }    
}
