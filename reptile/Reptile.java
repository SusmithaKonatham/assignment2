package reptile;

import java.util.Scanner;

public class Reptile
{
	static Scanner scanner=new Scanner(System.in);
	//---------------Start Reptile menu-------------
	
		public static void chooseReptileOption()
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Reptiles");
			System.out.println("Product ID	Name");
			System.out.println("1.RP-SN-01	Rattlesnake");
			System.out.println("2.RP-LI-02	Iguana");
			processUserChoice4(scanner.nextInt());
			System.out.println("--------------------------------------------------------------------");
		}
		 public static void processUserChoice4(int userChoice)
		 {
		        switch (userChoice)
		        {
		            case 1:
		            	rattlesnake();
		                break;
		            case 2:
		            	iguana();
		                break;
		        }
		 }
		private static void iguana() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Iguana");
			System.out.println("Item ID	Product ID	Description	List Price	"); 
			System.out.println("1.EST-13	RP-LI-02	Green Adult Iguana	$18.50	Add to Cart");
			System.out.println("--------------------------------------------------------------------");
		}
		private static void rattlesnake() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Rattlesnake");
			System.out.println("Item ID	Product ID	Description	List Price");	 
			System.out.println("1.EST-11	RP-SN-01	Venomless Rattlesnake	$18.50	Add to Cart");
			System.out.println("2.EST-12	RP-SN-01	Rattleless Rattlesnake	$18.50	Add to Cart");
			System.out.println("--------------------------------------------------------------------");	
		}
		//---------------End Reptile menu-------------

}
