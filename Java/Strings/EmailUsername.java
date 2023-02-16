import java.util.*;

public class EmailUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the email: ");
        String email = sc.nextLine();
        String username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                username+=email.charAt(i);
            }
        }
        System.out.println(username);
        sc.close();
    }
}
