/**
 * 
 */
package review;
import java.util.Scanner;
/**
 * @author TV111790
 *
 */
public class EnterSmallValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int userEntry;
		final int LIMIT = 3;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer no higher than " + LIMIT);
		userEntry = input.nextInt();
		while(userEntry > LIMIT)
		{
			System.out.print("The number you entered was too high ");
			System.out.print("Please enter an integer no higher than " + LIMIT);
			userEntry = input.nextInt();
		}
		System.out.print("You entered " + userEntry);

	}

}
