package fish;
import java.util.Scanner;

public class Fish 
{
	static Scanner scanner=new Scanner(System.in);
	//-----------------Start Fish menu---------------------
	public static void chooseFishOption()
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
		System.out.println("Fish");
		System.out.println("Product ID	Name");
		System.out.println("-----------------------------");
		System.out.println("1.FI-SW-01	Angelfish");
		System.out.println("-----------------------------");
		System.out.println("2.FI-SW-02	Tiger Shark");
		System.out.println("-----------------------------");
		System.out.println("3.FI-FW-01	Koi");
		System.out.println("-----------------------------");
		System.out.println("4.FI-FW-02	Goldfish");
		System.out.println("-----------------------------");
		System.out.println("Enter Your Choice :");
		processUserChoice1(scanner.nextInt());
	
	}
	 public static void processUserChoice1(int userChoice)
	 {
	        switch (userChoice)
	        {
	            case 1:
	            	 FishSubMenu.angelFish();
	                break;
	            case 2:
	            	 FishSubMenu.tigerFish();
	                break;
	            case 3:
	            	 FishSubMenu.koi();
	                break;
	            case 4:
	                FishSubMenu.goldFish();
	                break;
	        }
	 }
	
	
	
	
	//-----------------End Fish menu------------

}
