/**
 * 
 */
package youDoIt;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class AssignVolunteer3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		

		int donationType;
		String volunteer;
		String message;
		final int clothingCode = 1;
		final int otherCode = 2;
		final String clothingPricer = "Regina";
		final String otherPricer = "Marco";
		
		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + clothingCode + " for clothing, " + otherCode + " for anything else");
		donationType = input.nextInt();
		
		if(donationType == clothingCode)
		{
			volunteer = clothingPricer;
			message = "a clothing donation";
		}
		else
		{
			volunteer = otherPricer;
			message = "a non-clothing donation";
		}
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
		System.out.println("This is " + message);

	}

}
