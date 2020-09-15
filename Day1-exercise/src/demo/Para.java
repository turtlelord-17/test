package demo;
import java.util.*;
public class Para {
	int id;
	String name;
	Para(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Para ob1 = new Para(12,"John");
		Para ob2 = new Para(10,"Annie");
	}
}
