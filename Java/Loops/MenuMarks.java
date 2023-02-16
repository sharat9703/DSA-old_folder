import java.util.*;

public class MenuMarks {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks,in;

    do{
       marks= sc.nextInt();
       if(marks>=90){
        System.out.println("This is good! ");
      }
      else if(marks>=60 && marks<=89){
        System.out.println("This is also good");
      }
      else if(marks>=40 && marks<=59){
        System.out.println("This is good as well");
      }
      else{
        System.out.println("Well ...It's okay I guess..");
      }
      System.out.println("Press 1 to continue;\nPress 0 to exit");
       in = sc.nextInt();     
    }while(in==1);
    sc.close();
  
  
}    
}
