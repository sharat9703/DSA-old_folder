
public class PrintKeyPadCombinations {
    public static String[] keypad=  {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypadCombinations(String str, int idx, String combination) {
             if(idx == str.length() ){
                System.out.println(combination);
                return;
             }
             char cuChar = str.charAt(idx);
             String mapping = keypad[cuChar-'0'];
             for(int i=0;i<mapping.length();i++){
                keypadCombinations(str, idx+1, combination+mapping.charAt(i));
             }

        }
    
    public static void main(String[] args) {
        String str = "2";
        keypadCombinations(str, 0, "");
    }
}
