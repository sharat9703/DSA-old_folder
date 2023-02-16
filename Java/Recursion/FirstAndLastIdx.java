//print first and last index of a character in a string
public class FirstAndLastIdx {
    public static int first = -1;
    public static int last = -1;

    public static void PrintIdx(char element, String string, int idx) {
        if (idx == string.length()) {

            System.out.println(first);
            System.out.println(last);
            return;
        }
        char CurrElement = string.charAt(idx);
        if (element == CurrElement) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }
        PrintIdx(element, string, idx + 1);

    }

    public static void main(String[] args) {
        String str = "bbaacxderftgaaacdgtyawert";
        PrintIdx('a', str, 0);
    }
}
