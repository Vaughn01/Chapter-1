/**
 * 
 */
package exercisesPage175;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class FiveB {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double firstNumber;
		double secondNumber;
		double Percentage;
		double Percentage2;
		percentage();
		percentage2();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number that you would like to use ");
		firstNumber = input.nextDouble();
		
		System.out.print("Enter the second number that you would like to use");
		secondNumber = input.nextDouble();
		
		
		
		Percentage = computePercentageInfo(firstNumber, secondNumber);
		System.out.println("The percentage between the first number and the second number is " + Percentage + "%.");
		
		Percentage2 = computePercentage2Info(secondNumber, firstNumber);
		System.out.println("The percentage between the second number and the first number is " + Percentage2 + "%.");

	}
	public static void percentage()
	{
		System.out.println("We will help you with your math homework.");
		System.out.println("We will make you look smart.");
		computePercentageInfo(0, 0);
	}
	
	public static void percentage2()
	{
		System.out.println("Do you need the numbers reversed?");
		System.out.println("Don't worry, we will help you with that too!");
		computePercentage2Info(0, 0);
	}
	
	public static double computePercentageInfo(double firstNumber, double secondNumber)
	{
		double percentage;
		percentage = firstNumber / secondNumber ;
		return percentage; 
	}
	
	
	public static double computePercentage2Info(double secondNumber, double firstNumber)
	{
		double percentage;
		percentage = secondNumber / firstNumber ;
		return percentage; 
	}

}