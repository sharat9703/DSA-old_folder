public class PrintAllPermutationsOfStr {
public static void permutOfStr(String str, String permutation) {
    if(str.length()==0){
        System.out.println(permutation);
        return;
     }
    for(int i=0;i<str.length();i++){
        char curChar = str.charAt(i); 
        String newStr = str.substring(0, i)+str.substring(i+1);
        permutOfStr(newStr, permutation+curChar);   
    }
    
}
    public static void main(String[] args) {
          String str = "abc";
          permutOfStr(str,"");        
    }
    
}
