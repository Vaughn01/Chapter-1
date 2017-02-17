/**
 * 
 */
package switches1;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class SwitchStatementAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How old are you");
		user = input.nextInt();
		switch(user)
		{
		case 18:
			System.out.println("You are finally a legal adult.");
			break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		System.out.println("You are between 21-30");
		break;
		case 30:
			System.out.println("Time for a family!!");
			break;
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
		case 37:
		case 38:
		case 39:
			System.out.println("You are between 31-40!!");
			break;
		case 40:
			System.out.println("Time for menopause!");
			break;
		case 41:
		case 42:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
			System.out.println("You are between 41-50");
			break;
		case 50:
			System.out.println("You have half a century's experience");
			break;
		case 51:
			System.out.println("Congratulations! You managed to live half a century!!!");
			break;
			default:
					System.out.println("You are very wise!!");
					
		}
		

	}

}
