public class MyString 
{
	private int length; //#2a
	private char[] array; //#2b
	
	public MyString()
	{
		length = 0;
		array = new char[0];
	}
	public MyString(String parameter)
	{
		length = parameter.length();
		array = parameter.toCharArray();
	}
	public boolean equals(String parameter)
	{
		boolean ans = false;
		if(parameter.length()==array.length) 
		{
			for(int i = 0; i<parameter.length(); i++)
			{
				if(parameter.charAt(i)==array[i])
				{
					ans = true;
				}
				else
				{
					ans = false;
					break;
				}
			}
		}
		else {
			ans = false;}
		return ans;
	}
	public int indexOf(char arg)
	{
		int ans = -1;
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]==arg)
			{
				ans = i;
				break;
			}
		}
		return ans;
	}
	public int indexOf(String parameter)
	{
		int ans = -1;
		if(parameter.length()>array.length)
		{
			ans = -1;
		}
		else {
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]==parameter.charAt(0))
			{
				ans = i;
				for(int j = 0; j<parameter.length(); j++)
				{
					if(array[i+j]!=parameter.charAt(j))
					{
						ans = -1;
					}
				}
			}
		}
		}
		return ans;
	}
	public boolean startsWith(String parameter)
	{
		//HELP
		
		boolean ans = false;
		if(parameter.length()>array.length)
		{
			ans = false;
		}
		else
		{
			for(int i=0; i<parameter.length(); i++)
			{
				if(parameter.charAt(i)==array[i])
				{
					ans = true;
				}
			}
		}
		return ans;
		/*String original = array.toString();
		boolean ans = false;
		if(original.contains(parameter))
		{
			if(original.indexOf(parameter)==0)
			{
				ans = true;
			}
		}
		return ans;*/
	}
	public boolean endsWith(String parameter) 
	{ 
		//HELP
		boolean ans = false;
		if(parameter.length()>array.length)
		{
			ans = false;
		}
		else
		{
			//for(int i=0; i<parameter.length(); i++)
			//{
				if(parameter.charAt(parameter.length()-1)==array[array.length-1])
				{
					ans = true;
				}
			//}
		}
		return ans;
		/* original = array.toString();
		boolean ans = false;
		if(original.contains(parameter))
		{
			if(parameter.substring(parameter.length()-1, parameter.length()).equals(original.substring(original.length()-1, original.length())))
			{
				ans = true;
			}
		}
		return ans;*/
	}
	public boolean contains(String parameter)
	{
		/*boolean ans = false;
		int j = 0;
		for(int i = 0; i<array.length-parameter.length(); i++)
		{
			for(j = 0; j<parameter.length(); j++)
			{
				if(parameter.charAt(i)==array[i+j]) //ERROR
				{
					break;
				}
			}
			if(j == parameter.length())
			{
				return true;
			}
		}
		return false;*/
		
		
		/*boolean ans = false;
		if(array.toString().contains(parameter))
		{
			ans = true;
		}
		return ans;*/
		
		boolean ans = false;
		String string = new String(array);
		if(string.contains(parameter))
		{
			ans = true;
		}
		return ans;
	}

	public String toString()
	{
		String ans = String.valueOf(array);
		return ans;
	}
}
