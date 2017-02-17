/**
 * 
 */
package exercisesPage175;

import java.util.Scanner;
/**
 * @author TV111790
 *
 */
public class FourB {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String Answers;
		int firstNumber;
		int secondNumber;
		int q1A1;
		int q1A2;
		int q2A1;
		int q2A2;
		int q3A1;
		int q3A2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number you would like. ");
		firstNumber= input.nextInt();
		
		System.out.print("Enter the second number you would like. ");
		secondNumber= input.nextInt();
		
		q1A1 = firstNumber * 2;
		System.out.println("Two times" + firstNumber + " equals " + q1A1);
		q1A2 = secondNumber * 2;
		System.out.println("Two times" + secondNumber + " equals " + q1A2);
		q2A1 = firstNumber + 5;
		System.out.println(firstNumber + " plus 5 equals " + q2A1);
		q2A2 = firstNumber + 5;
		System.out.println(secondNumber + " plus 5 equals " + q2A2);
		q3A1 = firstNumber * firstNumber;
		System.out.println(firstNumber + " times itself " + q3A1);
		q3A2 = secondNumber * secondNumber;
		System.out.println(secondNumber + " times itself equals " + q3A2);

	}

	public static void displayTwiceTheNumber()
	{
		System.out.println("We will help you with your math homework.");
		System.out.println("We will make you look smart.");
		
	}
	public static void displayNumberPlusFive()
	{
		System.out.println("We will help you with your math homework.");
		System.out.println("We will make you look smart.");
		
	}
	public static void displayNumberSquared()
	{
		System.out.println("We will help you with your math homework.");
		System.out.println("We will make you look smart.");
		
	}
}
