//Remove duplicates in a string

public class RemDup{
 public static boolean[] map = new boolean[26];
 public static void remdupStr(String str, int idx,String newStr){
    if(idx ==str.length()){
        System.out.println(newStr);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar-'a']){
        currChar++;
        remdupStr(str, idx+1, newStr);
    }
    else{
        map[currChar-'a'] = true;
        newStr+=currChar;
        remdupStr(str, idx+1, newStr);
    }
    

 }
    public static void main(String[] args) {
        remdupStr("axbsbabxxceds", 0, "");
    }

}