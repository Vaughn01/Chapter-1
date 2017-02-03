/**
 * 
 */
package youDoIt;

import java.util.Scanner;
/**
 * @author TV111790
 *
 */
public class ParadiseInfo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cut-off price of discount>> ");
		price = keyboard.nextDouble();
		
		System.out.print("Enter discount rate as a whole number >>");
		discount = keyboard.nextDouble();
		displayInfo();
		
		
		
		savings = computeDiscountInfo(price, discount);
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + " percent.");
		System.out.println("That's a savings of at least $" + savings);
		
		
		

	}
	public static void displayInfo()
	{
		System.out.println("Paradise Day Spa wants to pamper you.");
		System.out.println("We will make you look good.");
		computeDiscountInfo(0, 0);
	}
	
	public static double computeDiscountInfo(double price, double discount)
	{
		double savings;
		savings = price * discount / 100;
		return savings; 
	}

}
