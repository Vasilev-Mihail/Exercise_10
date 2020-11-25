package Person;

import java.util.Scanner;

public class Person 
{	
	Scanner add = new Scanner(System.in);
	
	String Name;
	String SurName;
	String MidName;
	
	public void EnterName()
	{
		while(true)
		{
			Name = add.nextLine(); 
			if(Name.isEmpty())
			{
				System.out.println("You entered an empty line instead of a name");
			}
			else
			{
				break;
			}
		}
	}
		
	public void EnterSurName()
	{
		while(true)
		{
			SurName = add.nextLine(); 
			if(SurName.isEmpty())
			{
				System.out.println("You entered an empty line instead of a Surname");
			}
			else
			{
				break;
			}
		}	
	}
	
	public void EnterMidName()
	{
		while(true)
		{
			MidName = add.nextLine(); 
			if(MidName.isEmpty())
			{
				System.out.println("You entered an empty line instead of a Midname");
			}
			else
			{
				break;
			}
		}
	}
	
	public void EnterNSM()
	{
		   EnterName();
		EnterSurName();
		EnterMidName();
	}
	
	public void ReturnNSM()
	{
		System.out.println(Name + " " + SurName + " " + MidName); 
	}
}
