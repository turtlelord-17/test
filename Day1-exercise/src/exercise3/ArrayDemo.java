package exercise3;
import java.util.*;
public class ArrayDemo
{
    public static void main(String args[]) 
    {
        int a, b;
        Scanner sc= new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        System.out.println("Before Swapping:");
        System.out.println(list);

        System.out.println("Enter array index numbers to which you want to swap: ");
        try {
            a= sc.nextInt();
            b= sc.nextInt();
            Collections.swap(list, a, b);
            System.out.println(list);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Index numbers entered are invalid. The index numbers should be between 0 and 5.");
        }
    }
}


  