
public class Interview_corrected
{
	public String Interview(String input)
	{	
		//define variables
		String backwards = "";
		
		//use a decrementing for loop to re arrange the input string and saving it in the backwards variable
		for(int i = input.length() - 1; i >= 0 ; i-- )
		{
			backwards = backwards + input.charAt(i);					
		}
		
		//return backwards string
		return backwards;
	}//end Interview()
		
}//end interview corrected
