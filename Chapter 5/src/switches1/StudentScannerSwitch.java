/**
 * 
 */
package switches1;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class StudentScannerSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String studentString;
		int studentNumber;
		
		System.out.print("Scan book or ID>>>");
		studentString = input.nextLine();
		
		Scanner input = new Scanner(System.in);
		if (studentNumber >= 100000 || studentNumber <= 4000000)
		switch(studentString)
		{
		case 274896:
			System.out.print("Its Andrew McKenzie");
			break;
		case 274885:
			System.out.print("It's Charles Carlsrom!");
			break;
		case 316282:
			System.out.print("It's Ress Alzahrani!");
			break;
		case 274884:
			System.out.print("It's ME!");
			break;
		case 133778:
			System.out.print("It's Nick Hasson!");
			break;
		case 131457:
			System.out.print("It's Kassie Remley!");
			break;
		case 137412:
			System.out.print("It's Sebastion Frick!");
			break;
		case 131147:
			System.out.print("It's Zach Dorris!");
			break;
		case 274887:
			System.out.print("It's Chase Kress!");
			break;
		case 133225:
			System.out.print("It's Isaiah Ponciano!");
			break;
		case 137428:
			System.out.print("It's Mason Hancock!");
			break;
		default: 
			System.out.print("IT DOES NOT EXIST!!");
	
		}

			


	}

}
