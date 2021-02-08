package birds;
import java.util.Scanner;
public class Bird 
{
	static Scanner scanner=new Scanner(System.in);
		//---------------Start Bird menu-------------
			public static void chooseBirdsOption()
			{
				
				System.out.println(" Fish|Dogs|Cats|Reptails|Birds");
				System.out.println("Birds");
				System.out.println("--------------------------------");
				System.out.println("Product ID	Name");
				System.out.println("--------------------------------");
				System.out.println("1.AV-CB-01	Amazon Parrot");
				System.out.println("--------------------------------");
				System.out.println("2.AV-SB-02	Finch");
				System.out.println("--------------------------------------------------------------------");
				processUserChoice5(scanner.nextInt());
			}
			 public static void processUserChoice5(int userChoice)
			 {
			        switch (userChoice)
			        {
			            case 1:
			            	BirdSubMenu.amazonParrot();
			                break;
			            case 2:
			                BirdSubMenu.finch();
			                break; 
			        }
			 }
			
			//------------------End Bird menu-------------------

	}



