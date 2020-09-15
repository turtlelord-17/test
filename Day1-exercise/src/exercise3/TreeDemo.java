package exercise3;
import java.util.*;  
public class TreeDemo {  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("L");  
         set.add("M");  
         set.add("N");  
         set.add("O");  
         set.add("P");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         System.out.println("Head Set: "+set.headSet("N", true));  
          
         System.out.println("SubSet: "+set.subSet("L", false, "P", true));  
           
         System.out.println("TailSet: "+set.tailSet("N", false));  
 }  
} 
