import java.util.*;

public class Concat {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputName = sc.next();
    String name1 = "Morgan";
    String name2 = "Stanley";
    String fullname = name1+" "+name2;
    System.out.println(inputName+" "+fullname);
    System.out.println("This is the length "+fullname.length());
    System.out.println(fullname.substring(7));
    int n = Integer.parseInt(inputName);
    System.out.println(n);
    String str = Integer.toString(n);
    System.out.println(str.length());
    sc.close();
}    
}
