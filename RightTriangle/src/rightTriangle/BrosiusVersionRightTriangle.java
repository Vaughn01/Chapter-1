/**
 * 
 */
package rightTriangle;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class BrosiusVersionRightTriangle {
	private static Scanner keyboard;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String choiceSide;
		int quit=0;
	
		
		System.out.print("We are helpful. \nWe will help you with math!!!");
		
		do
		{
			keyboard = new Scanner(System.in);
			System.out.println("\nWhich side would you like to solve for in your right triangle?");
			System.out.println(" \nType A for Side A \nType B for Side B, \nType C for Side C");
			choiceSide = keyboard.nextLine(); 
			if("A".equals(choiceSide)){
					aSide();}
			if("B".equals(choiceSide)){
					bSide();}
			if("C".equals(choiceSide)){
					cSide();}
			System.out.println("\nPress 1 to quit 2 for solve another triangle");
			
			quit = keyboard.nextInt(); 	 
		}while(quit != 1);
		
		
//		

	}
	public static void aSide()
	{
		double B;
		double C;
		double CalculateA;
	
		System.out.print("Enter the number for side B");
		B = keyboard.nextDouble();
		System.out.print("Enter the number for side C");
		C = keyboard.nextDouble();
		CalculateA = Math.sqrt((C * C) - (B* B));
		System.out.print("The answer is " + CalculateA);

	}

	public static void bSide() 
	{
		double A;
		double C;
		double CalculateB;
	
		System.out.print("Enter the number for side A");
		A = keyboard.nextDouble();
		System.out.print("Enter the number for side C");
		C = keyboard.nextDouble();
		CalculateB = Math.sqrt((C * C) - (A* A));
		System.out.print("The answer is " + CalculateB);

	}

	public static void cSide()
	{
		double A;
		double B;
		double CalculateC;
	
		System.out.print("Enter the number for side A");
		A = keyboard.nextDouble();
		System.out.print("Enter the number for side B");
		B = keyboard.nextDouble();
		CalculateC = Math.sqrt((A * A) + (B* B));
		System.out.print("The answer is " + CalculateC);

	}


}