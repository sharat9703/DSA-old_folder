

import java.util.*;

public class Calculator {
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("enter two numbers:\n");
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println("\nChoose among the following:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
    int c = in.nextInt();
    switch(c){
        case 1:  
            System.out.println(addition(a, b));
            break;
        case 2:
            System.out.println(subtraction(a, b));
            break;
        case 3:
            System.out.println(multiplication(a, b));
            break;
        case 4:
            System.out.println(division(a, b));
            break;
        case 5:
            System.out.println(modulo(a, b));
            break;
default:
System.out.println("\nError! Please choose any one of the following:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");

    }
    in.close();

}
public static int addition(int x, int y) {
    return x+y;
}
public static int subtraction(int x, int y) {
    return x-y;
}   
public static int multiplication(int x, int y) {
    return x*y;
}
public static int division(int x, int y) {
    return x/y;
}
public static int modulo(int x, int y) {
    return x%y;
}
}
