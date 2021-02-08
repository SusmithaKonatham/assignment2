package birds;

import java.util.Scanner;

public class BirdSubMenu 
{
	static Scanner scanner=new Scanner(System.in);
	//--------------------SubMenu ParrotBird-------------------------
	public static void amazonParrot() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Amazon Parrot--------");
		System.out.println("   Item ID	Product ID	 Description	            List Price"); 
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1. EST-18	AV-CB-01	 Adult Male Amazon Parrot	 $193.50	    Add to Cart");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Enter Your Choice :");
		processFishChoice1(scanner.nextInt());
		
	}
	static void processFishChoice1(int choice) 
	{
		switch(choice)
		{
		case 1:
			AdultMaleAmazonParrot();
			break;
		}
	}
	private static void AdultMaleAmazonParrot() 
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("--------Adult Male Amazon Parrot--------");
		System.out.println("Great companion for up to 75 years");
		System.out.println("EST-18");
		System.out.println("Adult Male Amazon Parrot");
		System.out.println("Amazon Parrot");
		System.out.println("9962 in stock.");
		System.out.println("$193.50");
		System.out.println("Add to Cart");	
		System.out.println("-------------------------------");
	}
	//---------------End SubMenu ParrotBird-------------------
	//---------------Start SubMenu FinchBird------------------
	public static void finch()  {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Finch--------");
		System.out.println(" Item ID	Product ID	 Description	        List Price");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1.EST-19	AV-SB-02	Adult Male Finch	$15.50	   Add to Cart");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Enter Your Choice :");
		processFishChoice2(scanner.nextInt());
	}
	private static void processFishChoice2(int choice)
	{
		switch(choice)
		{
		case 1:
			AdultMaleFinch();
			break;
		}
		
	}
	private static void AdultMaleFinch()
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("--------AdultMaleFinch--------");
		System.out.println("Great stress reliever");
		System.out.println("EST-19");
		System.out.println("Adult Male Finch");
		System.out.println("Finch");
		System.out.println("9946 in stock.");
		System.out.println("$15.50");
		System.out.println("Add to Cart");
		System.out.println("------------------------------");


		
	}
	//---------------End SubMenu FinchBird------------------
}
