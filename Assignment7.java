import java.util.Scanner;

public class Assignment7 
{
	static Scanner scan = new Scanner(System.in);
	private static String mainMenu()
	{
		System.out.println("What would you like to do?");
		System.out.println("a. Create a Searchable String");
		System.out.println("b. Print the current Searchable String");
		System.out.println("c. Search within the String");
		System.out.println("d. Quit");
		String input = scan.nextLine();
		return input;
	}
	
	private static void searchString(MyString obj)
	{
		System.out.println("What String did you want to search for?");
		String str = scan.nextLine();
		
		if(obj.contains(str)==false)
		{
			System.out.println("The search string is not in the MyString");
		}
		else if(obj.equals(str))
		{
			System.out.println("The search is identical to the MyString");
		}
		else if(obj.startsWith(str))
		{
			System.out.println("The MyString starts with the search string");
		}
		else if(obj.endsWith(str))
		{
			System.out.println("The MyString ends with the search string");
		}
		else
		{
			System.out.println("The search starts at index " + obj.indexOf(str));
		}
	}
	public static void main(String[] args)
	{
		MyString searchStr = new MyString();
		System.out.println("Hi. Welcome to the String Searcher.");
		String input = mainMenu();
		while(!(input.equals("d")))
		{
			if(input.equals("a"))
			{
				System.out.println("Please enter the searchable string");
				String search = scan.nextLine();
				searchStr = new MyString(search);
				System.out.println("Set " + search + " as the searchable String");
			}
			else if(input.equals("b"))
			{
				System.out.println(searchStr.toString());
				
			}
			else if(input.equals("c"))
			{
				searchString(searchStr);
			}
			else
			{
				System.out.println("Please enter a valid input.");
			}
			input = mainMenu();
		}
		System.out.println("Goodbye!");
	}
}
