/**
 * 
 */
package youDoIt;

import java.util.Scanner;
/**
 * @author TV111790
 *
 */
public class MythicalPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		double rate;
		double hoursWorked;
		double regularPay;
		double overtimePay;
		final int FULL_WEEK = 40;
		final double OT_RATE = 1.5;
		final double GovmentGetHalf = .5;
		double afterTax;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many hours did you work this week?");
		hoursWorked = keyboard.nextDouble();
		System.out.print("What is your regular pay?");
		rate = keyboard.nextDouble();
		if(hoursWorked > FULL_WEEK)
		{
			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked-FULL_WEEK) * OT_RATE * rate;
			afterTax = overtimePay * GovmentGetHalf;
		}
		
		else
		{
			regularPay = FULL_WEEK * rate;
			overtimePay = 0.0;
			afterTax = regularPay * GovmentGetHalf;
		}
		
		System.out.println("Regular pay is " + regularPay + "\nOVertime Pay is " + overtimePay + " After tax is" + afterTax);
	}

}
