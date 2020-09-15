package demo;
import java.util.*;
public class Area {
	Area(int a,int b)
	{
		System.out.println("Area of rectangle is "+(a*b));
	}
	Area(int a)
	{
		System.out.println("Area of square is "+(a*a));
	}
	Area(double a)
	{
		System.out.println("Area of circle is "+(3.14*a*a));
	}
    public static void main(String args[])
    {
    	Area ob1 = new Area(11,12);
    	Area ob2 = new Area(10);
    	Area ob3 = new Area(2.5);
    }
}
