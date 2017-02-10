/**
 * 
 */
package decisionMaking;

import java.util.Scanner;
/**
 * @author tv111790
 *
 */
public class DoorPrize {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int choice;
		
		Scanner input = new Scanner(System.in);
		System.out.println("You have only 3 doors. Pick one and win or lose the prize!");
		choice = input.nextInt();
		
		//This is the part where I make the decisions
		
		if(choice == 1)
		{
			System.out.println("You got a Brand New Car!!!");
		}
		if(choice == 2)
		{
			System.out.println("You get eaten by allligators in the alligator pit!!!");
		}
		if(choice == 3)
		{
			System.out.println("You get to choose another door!");
		}
		if(choice >=4)
		{
			System.out.println("We only have 3 doors. Pick another!!!");
		}

	}

}
