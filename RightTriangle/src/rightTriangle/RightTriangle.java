/**
 * 
 */
package rightTriangle;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author TV111790
 *
 */
public class RightTriangle 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double A = 0;
		double B = 0;
		double C = 0;
		String choiceYes = null;
		String userEntry;
		double CalculateA = 0;
		double CalculateB = 0;
		double CalculateC = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("We are helpful. \n We will help you with math!!!");
		System.out.print("Which side would you like to solve for in your right triangle?");
		System.out.print(" \nType A for Side A \nType B for Side B, \nType C for Side C");
		userEntry = keyboard.nextLine(); 
		
		do
		{
			keyboard = new Scanner(System.in);
			aSide(A, B, C, CalculateA);
			System.out.print("Would you like to do more calculations?");
			if("Yes".equals(choiceYes) || "yes".equals(choiceYes))
			{
				System.out.print(" \nType A for Side A \nType B for Side B, \nType C for Side C");
				userEntry = keyboard.nextLine(); 
			}
			else
			{
				System.out.print(" \nHave a nice day!!!");
			}
			
		}while("A".equals(userEntry) || "a".equals(userEntry));
		do
		{
			keyboard = new Scanner(System.in);
			bSide(A, B, C, CalculateB );
			if("Yes".equals(choiceYes) || "yes".equals(choiceYes))
			{
				System.out.print(" \nType A for Side A \nType B for Side B, \nType C for Side C");
				userEntry = keyboard.nextLine(); 
			}
			else
			{
				System.out.print(" \nHave a nice day!!!");
			}
			
		}while("B".equals(userEntry) || "b".equals(userEntry));
		do
		{
			keyboard = new Scanner(System.in);
			cSide(A, B, C, CalculateC);
			if("Yes".equals(choiceYes) || "yes".equals(choiceYes))
			{
				System.out.print(" \nType A for Side A \nType B for Side B, \nType C for Side C");
				userEntry = keyboard.nextLine(); 
			}
			else
			{
				System.out.print(" \nHave a nice day!!!");
			}
			
		}while("C".equals(userEntry) || "c".equals(userEntry));

	}
	public static void aSide(double A, double B, double C, double CalculateA)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number for side B");
		B = keyboard.nextDouble();
		System.out.print("Enter the number for side C");
		C = keyboard.nextDouble();
		CalculateA = Math.sqrt((C * C) - (B* B));
		System.out.print("The answer is " + CalculateA);

	}

	public static void bSide(double A, double B, double C, double CalculateB) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number for side A");
		A = keyboard.nextDouble();
		System.out.print("Enter the number for side C");
		C = keyboard.nextDouble();
		CalculateB = Math.sqrt((C * C) - (A* A));
		System.out.print("The answer is " + CalculateB);

	}

	public static void cSide(double A, double B, double C, double CalculateC)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number for side A");
		A = keyboard.nextDouble();
		System.out.print("Enter the number for side B");
		B = keyboard.nextDouble();
		CalculateC = Math.sqrt((A * A) + (B* B));
		System.out.print("The answer is " + CalculateC);

	}


}
