package fish;
import java.util.Scanner;

public class FishSubMenu 
{
	static Scanner scanner=new Scanner(System.in);
	//---------------SubMenu GoldFish--------------------
	public static void goldFish()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Goldfish--------");
		System.out.println("   Item ID	Product ID	 Description	           List Price");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1. EST-20	FI-FW-02	 Adult Male Goldfish	   $5.50	     Add to Cart");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("2. EST-21	FI-FW-02	 Adult Female Goldfish     $5.29	     Add to Cart");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Enter Your Choice :");
		processFishChoice1(scanner.nextInt());
	}
	static void processFishChoice1(int choice) 
	{
		switch(choice)
		{
		case 1:
			adultMaleGoldfish();
			break;
		case 2:
			adultFemaleGoldfish();
			break;
		}
	}
	private static void adultFemaleGoldfish() 
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("------Adult Male GoldFish------");
		System.out.println("Fresh Water fish from China");
		System.out.println("EST-20");
		System.out.println("Adult Male Goldfish");
		System.out.println("Goldfish");
		System.out.println("9977 in stock.");
		System.out.println("$5.50");
		System.out.println("Add to Cart");
		System.out.println("-------------------------------");
	}
	private static void adultMaleGoldfish()
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("------Adult Female GoldFish------");
		System.out.println("Fresh Water fish from China");
		System.out.println("EST-21");
		System.out.println("Adult Female Goldfish");
		System.out.println("Goldfish");
		System.out.println("9986 in stock.");
		System.out.println("$5.29");
		System.out.println("Add to Cart");
		System.out.println("--------------------------------");
	}
	//-------------- End SubMenu GoldFish-----------------------
	//--------------SubMenu  KoiFish----------------------------
	public static void koi() 
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Koi--------");
		System.out.println("   Item ID	Product ID	    Description	  List Price");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1. EST-4	    FI-FW-01	    Spotted Koi	   $18.50	  Add to Cart");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("2. EST-5	    FI-FW-01	    Spotless Koi	$18.50	  Add to Cart");
		System.out.println("--------------------------------------------------------------------");	
		System.out.println("Enter Your Choice :");
		processFishChoice2(scanner.nextInt());
	}
	private static void processFishChoice2(int choice)
	{
			switch(choice)
			{
			case 1:
				SpottedKoi();
				break;
			case 2:
				SpotlessKoi();
				break;
			}
	}
	private static void SpotlessKoi()
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("------Spotted Koi------");
		System.out.println("Fresh Water fish from Japan");
		System.out.println("EST-4");
		System.out.println("Spotted Koi");
		System.out.println("Koi");
		System.out.println("9984 in stock.");
		System.out.println("$18.50");
		System.out.println("Add to Cart");
		System.out.println("---------------------------------");
	}
	private static void SpottedKoi()
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("------Spotted Koi------");
		System.out.println("Fresh Water fish from Japan");
		System.out.println("SysoEST-5");
		System.out.println("Spotless Koi");
		System.out.println("Koi");
		System.out.println("9981 in stock.");
		System.out.println("$18.50");
		System.out.println("Add to Cart");
		System.out.println("---------------------------------");
	}

	//-------------- End SubMenu  KoiFish----------------------------
   //-------------- Start SubMenu  TigerFish----------------------------
	
	public static void tigerFish() 
	{
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Tiger Shark--------");
		System.out.println("  Item ID	Product ID	Description	            List Price"); 
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1. EST-3	FI-SW-02	Toothless Tiger Shark	$18.50	     Add to Cart");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Enter Your Choice :");
		processFishChoice3(scanner.nextInt()) ;
	}
	static void processFishChoice3(int choice) 
	{
		switch(choice)
		{
		case 1:
			ToothlessTigerShark();
			break;
		}

	}
	private static void ToothlessTigerShark()
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("------Toothless Tiger Shark------");
		System.out.println("Salt Water fish from Australia");
		System.out.println("EST-3");
		System.out.println("Toothless Tiger Shark");
		System.out.println("Tiger Shark");
		System.out.println("9980 in stock.");
		System.out.println("$18.50");
		System.out.println("Add to Cart");
		System.out.println("---------------------------------");
	}
	//-------------- End SubMenu TigerFish----------------------------
   //-------------- Start SubMenu AngelFish----------------------------
	public static void angelFish()
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.err.println("--------Angelfish--------");
		System.out.println("  Item ID	Product ID	Description	     List Price");	
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("1. EST-1	FI-SW-01	Large Angelfish	 $16.50	      Add to Cart");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("2. EST-2	FI-SW-01	Small Angelfish	 $16.50	      Add to Cart");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Enter You Choice :");
		processFishChoice4(scanner.nextInt()) ;
	
	}
	
	static void processFishChoice4(int choice) 
	{
		switch(choice)
		{
		case 1:
			LargeAngelfish();
			break;
		case 2:
			SmallAngelfish();
			break;
		}
	}
	private static void SmallAngelfish()
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("------SmallAngelfish------");
		System.out.println("Salt Water fish from Australia");
		System.out.println("EST-2");
		System.out.println("Small Angelfish");
		System.out.println("Angelfish");
		System.out.println("9989 in stock.");
		System.out.println("$16.50");
		System.out.println("Add to Cart");
		System.out.println("---------------------------------");
	}
	private static void LargeAngelfish()
	{
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("------ LargeAngelfish------");
		System.out.println("Salt Water fish from Australia");
		System.out.println("EST-1");
		System.out.println("Large Angelfish");
		System.out.println("Angelfish");
		System.out.println("9852 in stock.");
		System.out.println("$16.50");
		System.out.println("Add to Cart");
		System.out.println("---------------------------------");
	}
	//-------------- End SubMenu AngelFish----------------------------
}
