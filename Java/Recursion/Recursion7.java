//Tower of Hanoi

import java.util.*;

public class Recursion7 {
public static void main(String[] args) {
    int n=2;
    TowerOfHanoi(n, "S", "H", "D");
}   
public static void TowerOfHanoi(int n,String source,String helper, String destination) {
    if(n==1){
     System.out.println("Tranferred disk "+n+" from "+source+" to "+destination);
     return;
    } 
    
    TowerOfHanoi(n-1, source,destination, helper);
    System.out.println("Tranferred disk "+n+" from "+source+" to "+destination);
    TowerOfHanoi(n-1, helper, source, destination);
} 
}

/*
 * 
 * 
 * 
 * 
 *        
 * 
 */
