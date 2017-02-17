/**
 * 
 */
package switches1;

import java.util.Scanner;
/**
 * @author TV111790
 *
 */
public class SwitchDoOfWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a day during the week for your schedule >>>");
		day = input.nextLine();
		switch(day)
		{
		case "Monday":
			System.out.print("Reserve room for Friday meeting");
			break;
		case "Tuesday":
			System.out.print("Bring Tacos its Taco Tuesday!");
			break;
		case "Wednesday":
			System.out.print("HUMP DAY!!!! Work hard start sweating!");
			break;
		case "Thursday":
			System.out.print("Make sure that room is still reserved!");
			break;
		case "Friday":
			System.out.print("ITS FRIDAY TIME TO PARTY AFTER FRIDAY MEETING!");
			break;
		case "Saturday":
			System.out.print("ENJOY THE DAY OFF!");
			break;
		case "Sunday":
			System.out.print("Prepare for school tomorrow!");
		break;
		default: 
			System.out.print("Do you see this on the calendar? If not it means, IT DOES NOT EXIST!!");
	
		}

	}

}
