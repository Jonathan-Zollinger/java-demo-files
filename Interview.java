
public class Interview 
{
	public String Interview(String input)
	{				
				String backwards = "";
		for(i = input.length - 1; i >= 0 ; i-- )
		{
			backwards = backwards + input[i];					
		}
		return backwards
	}//end Interview()
		
}
