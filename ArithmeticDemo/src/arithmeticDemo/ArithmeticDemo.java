/**
 * 
 */
package arithmeticDemo;

import javax.util.scanner;

public class ArithmeticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int firstNumber; 
		int secondNumber;
		int sum;
		int difference;
		int average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextInt();
		
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = (firstNumber + secondNumber) / 2 ;
		
		

	}

}
