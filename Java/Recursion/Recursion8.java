//print string using recursion
public class Recursion8 {
public static void main(String[] args) {
    String str = "abcd";
rev(str, str.length()-1);
}   
public static void rev(String string, int idx) {
 if(idx ==0){
    System.out.print(string.charAt(idx));
    return;
 }   
 System.out.print(string.charAt(idx));
 rev(string, idx-1);
}
}
