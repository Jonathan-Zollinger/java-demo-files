package week9;

public class Testing 
{
	public static void main(String[] args) 
	{
		String str = new String("28/12/2013");
		
		String array1[]= str.split("/");
		for (String temp: array1)
		{
		      System.out.println(temp);
		}
	}
}
