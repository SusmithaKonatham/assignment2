package cats;

import java.util.Scanner;

public class Cat 
{
	static Scanner scanner=new Scanner(System.in);
	//---------------Start Cat menu-------------
	
		public static void chooseCatOption()
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Cats");
			System.out.println("Product ID	Name");
			System.out.println("1.FL-DSH-01	Manx");
			System.out.println("2.FL-DLH-02	Persian");

			processUserChoice3(scanner.nextInt());
			System.out.println("--------------------------------------------------------------------");
		}
		 public static void processUserChoice3(int userChoice)
		 {
		        switch (userChoice)
		        {
		            case 1:
		                manx();
		                break;
		            case 2:
		                persian();
		                break;
		        }
		  }
		private static void persian() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Persian");
			System.out.println("Item ID	Product ID	Description	List Price");
			System.out.println("EST-16	FL-DLH-02	Adult Female Persian	$93.50	Add to Cart");
			System.out.println("EST-17	FL-DLH-02	Adult Male Persian	$93.50	Add to Cart");
			System.out.println("--------------------------------------------------------------------");
		}
		private static void manx()
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Manx");
			System.out.println("Item ID	Product ID	Description	List Price");	 
			System.out.println("EST-14	FL-DSH-01	Tailless Manx	$58.50	Add to Cart");
			System.out.println("EST-15	FL-DSH-01	With tail Manx	$23.50	Add to Cart");
			System.out.println("--------------------------------------------------------------------");	
		}	
		//-------------------------------------End Cat menu------------------------------------------
}
