package exercise1;

public class Singleton {
   
	private static Singleton instance;
	
	private Singleton(){ }
	
	public static synchronized Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
			System.out.println("Singleton created..");
		}
		return instance;
	}
}
 