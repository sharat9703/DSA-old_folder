public class HashCaps {
    public static void main(String[] args) {
    String str = "AbcaZeoB";  
    hashcaps(str);  
    }
    public static void hashcaps(String s) {
        StringBuilder sb =new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    sb.append('#');
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
        }
        sb.append(sb);
        System.out.println(sb);
    }

}
