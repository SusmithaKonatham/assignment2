package dogs;

import java.util.Scanner;

public class Dog
{
	static Scanner scanner=new Scanner(System.in);
	//---------------Start Dog menu-------------
		public static void chooseDogOption()
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Dogs");
			System.out.println("Product ID	Name");
			System.out.println("1.K9-BD-01	Bulldog");
			System.out.println("2.K9-PO-02	Poodle");
			System.out.println("3.K9-DL-01	Dalmation");
			System.out.println("4.K9-RT-01	Golden Retriever");
			System.out.println("5.K9-RT-02	Labrador Retriever");
			System.out.println("6.K9-CW-01	Chihuahua");
			processUserChoice2(scanner.nextInt());
			System.out.println("--------------------------------------------------------------------");
		}
		 public static void processUserChoice2(int userChoice)
		 {
		        switch (userChoice)
		        {
		            case 1:
		                bullDog();
		                break;
		            case 2:
		                poodle();
		                break;
		            case 3:
		                dalmation();
		                break;
		            case 4:
		                goldenRetriever();
		                break;
		            case 5:
		               labradorRetriever();
		                break;
		            case 6:
		                chihuahua();
		                break;  
		        }
		 }
		private static void chihuahua() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Chihuahua");
			System.out.println("Item ID	Product ID	Description	List Price");	 
			System.out.println("1.EST-26	K9-CW-01	Adult Male Chihuahua	$125.50	Add to Cart");
			System.out.println("2.EST-27	K9-CW-01	Adult Female Chihuahua	$155.29	Add to Cart");
			System.out.println("--------------------------------------------------------------------");
		}
		private static void labradorRetriever() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Labrador Retriever");
			System.out.println("Item ID	Product ID	Description	List Price");
			System.out.println("1.EST-22	K9-RT-02	Adult Male Labrador Retriever	$135.50	Add to Cart");
			System.out.println("2.EST-23	K9-RT-02	Adult Female Labrador Retriever	$145.49	Add to Cart");
			System.out.println("3.EST-24	K9-RT-02	Adult Male Labrador Retriever	$255.50	Add to Cart");
			System.out.println("4.EST-25	K9-RT-02	Adult Female Labrador Retriever	$325.29 Add to Cart");
			System.out.println("--------------------------------------------------------------------");
		}
		private static void goldenRetriever() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Golden Retriever");
			System.out.println("Item ID	Product ID	Description	List Price"); 
			System.out.println("1.EST-28	K9-RT-01	Adult Female Golden Retriever	$155.29	Add to Cart");
			System.out.println("--------------------------------------------------------------------");
		}
		private static void dalmation() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Dalmation");
			System.out.println("Item ID	Product ID	Description	List Price");	 
			System.out.println("1.EST-9	K9-DL-01	Spotless Male Puppy Dalmation	$18.50	Add to Cart");
			System.out.println("2.EST-10	K9-DL-01	Spotted Adult Female Dalmation	$18.50	Add to Cart");
			System.out.println("--------------------------------------------------------------------");	
		}
		private static void poodle() 
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Poodle");
			System.out.println("Item ID	Product ID	Description	List Price");	 
			System.out.println("1.EST-8	K9-PO-02	Male Puppy Poodle	$18.50	Add to Cart");
			System.out.println("--------------------------------------------------------------------");
		}
		private static void bullDog()
		{
			System.out.println("--------------------------------------------------------------------");
			System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
			System.out.println("Bulldog");
			System.out.println("Item ID	Product ID	Description	List Price"); 
			System.out.println("1.EST-6	K9-BD-01	Male Adult Bulldog	$18.50	Add to Cart");
			System.out.println("2.EST-7	K9-BD-01	Female Puppy Bulldog	$18.50	Add to Cart");
			System.out.println("--------------------------------------------------------------------");
		}
		//------------------End Dogs menu-------------------


}
