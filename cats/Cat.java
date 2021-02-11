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
		            	CatSubMenu.manx();
		                break;
		            case 2:
		            	CatSubMenu.persian();
		                break;
		        }
		  }
		//-------------------------------------End Cat menu------------------------------------------
}
