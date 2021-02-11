package cats;

import java.util.Scanner;

public class CatSubMenu
{
	static Scanner scanner=new Scanner(System.in);
	public static void persian() 
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Persian--------");
		System.out.println("  Item ID	Product ID	 Description	           List Price");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1. EST-16	FL-DLH-02	 Adult Female Persian	    $93.50	   Add to Cart");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("2. EST-17	FL-DLH-02	 Adult Male Persian	        $93.50	   Add to Cart");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Enter Your Choice :");
		processFishChoice1(scanner.nextInt());
	}
	static void processFishChoice1(int choice) 
	{
		switch(choice)
		{
		case 1:
			 adultFemalePersian();
			break;
		case 2:
			adultMalePersian();
			break;
		}
	}
	private static void adultMalePersian() 
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("-----------adultMalePersian-----------");
		System.out.println("Friendly house cat, doubles as a princess");
		System.out.println("EST-17");
		System.out.println("Adult Male Persian");
		System.out.println("Persian");
		System.out.println("9972 in stock.");
		System.out.println("$93.50");
		System.out.println("Add to Cart");
		
	}
	private static void adultFemalePersian() 
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("-----------adultFemalePersian-----------");
		System.out.println("Friendly house cat, doubles as a princess");
		System.out.println("EST-16");
		System.out.println("Adult Female Persian");
		System.out.println("Persian");
		System.out.println("9969 in stock.");
		System.out.println("$93.50");
		System.out.println("Add to Cart");
	}
	public static void manx()
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Manx--------");
		System.out.println("   Item ID	Product ID	Description	    List Price");	
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1. EST-14	FL-DSH-01	Tailless Manx	$58.50	   Add to Cart");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("2. EST-15	FL-DSH-01	With tail Manx	$23.50	   Add to Cart");
		System.out.println("--------------------------------------------------------------------");	
		processFishChoice2(scanner.nextInt());
	}	
	static void processFishChoice2(int choice) 
	{
		switch(choice)
		{
		case 1:
			taillessManx();
			break;
		case 2:
			withtailManx();
			break;
		}
	}
	private static void withtailManx() 
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("----------- withtailManx-----------");
		System.out.println("Great for reducing mouse populations");
		System.out.println("EST-15");
		System.out.println("With tail Manx");
		System.out.println("Manx");
		System.out.println("9972 in stock.");
		System.out.println("$23.50");
		System.out.println("Add to Cart");

	}
	private static void taillessManx()
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("-----------taillessManx-----------");
		System.out.println("Great for reducing mouse populations");
		System.out.println("EST-14");
		System.out.println("Tailless Manx");
		System.out.println("Manx");
		System.out.println("9615 in stock.");
		System.out.println("$58.50");
		System.out.println("Add to Cart");
		
	}

}
