package dogs;

import java.util.Scanner;

public class DogSubMenu 
{
	static Scanner scanner=new Scanner(System.in);
	public static void chihuahua() 
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("--------Chihuahua--------");
		System.out.println("  Item ID	Product ID	Description	            List Price");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1. EST-26	K9-CW-01	Adult Male Chihuahua	$125.50	    Add to Cart");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("2. EST-27	K9-CW-01	Adult Female Chihuahua	$155.29	    Add to Cart");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Enter Your Choice :");
		processFishChoice1(scanner.nextInt());
	}
	static void processFishChoice1(int choice) 
	{
		switch(choice)
		{
		case 1:
			adultMaleChihuahua();
			break;
		case 2:
			adultFemaleChihuahua();
			break;
		}
	}
	private static void adultFemaleChihuahua() 
	{
	
		System.out.println("Great companion dog");
		System.out.println("EST-27");
		System.out.println("Adult Female Chihuahua");
		System.out.println("Chihuahua");
		System.out.println("9985 in stock.");
		System.out.println("$155.29");
		System.out.println("Add to Cart");
	}
	private static void adultMaleChihuahua()
	{

		System.out.println("Great companion dog");
		System.out.println("EST-26");
		System.out.println("Adult Male Chihuahua");
		System.out.println("Chihuahua");
		System.out.println("9987 in stock.");
		System.out.println("$125.50");
		System.out.println("Add to Cart");
	}
	//------------------------------------------------------------------
	public static void labradorRetriever() 
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("---------Labrador Retriever----------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("1. EST-22	K9-RT-02	Adult Male Labrador Retriever	$135.50	   Add to Cart");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("2. EST-23	K9-RT-02	Adult Female Labrador Retriever	$145.49	   Add to Cart");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("3. EST-24	K9-RT-02	Adult Male Labrador Retriever	$255.50	   Add to Cart");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("4. EST-25	K9-RT-02	Adult Female Labrador Retriever	$325.29    Add to Cart");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Enter Your Choice :");
		processFishChoice2(scanner.nextInt());
	}
	static void processFishChoice2(int choice) 
	{
		switch(choice)
		{
		case 1:
			adultMaleLabradorRetriever();
			break;
		case 2:
			adultFemaleLabradorRetriever();
			break;
		case 3:
			adultMaleLabradorRetriever();
			break;
		case 4:
			adultFemaleLabradorRetriever();
			break;
		}
	}
	private static void adultFemaleLabradorRetriever() {
		// TODO Auto-generated method stub
		
	}
	private static void adultMaleLabradorRetriever() {
		// TODO Auto-generated method stub
		
	}
}
