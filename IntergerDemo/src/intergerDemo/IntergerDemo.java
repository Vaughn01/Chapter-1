/**
 * 
 */
package intergerDemo;
import java.util.Scanner;

public class IntergerDemo {

 static int anInt = 1234;
 static byte aByte = 12;
 static long aLong = 1234567890987654321L;
 static short aShort = 12345;
	public static void main(String[] args) 
	{
		
		int anInt = 1234;
		byte aByte = 12;
		short aShort = 1234;
		long aLong = 1234;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer >>>");
		anInt = input.nextByte();
		
		System.out.print("Please enter a byte >>>");
		aByte = input.nextByte();
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);

	}

}
