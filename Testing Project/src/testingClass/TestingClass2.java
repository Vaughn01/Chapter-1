/**
 * 
 */
package testingClass;

import javax.swing.JOptionPane;


public class TestingClass2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String strNum1;
		int num1;
		int num2;
		int num3;
		int num4;
		int answer;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please enter a number>>");
		num1 = Integer.parseInt(strNum1);
		
		strNum1 = JOptionPane.showInputDialog(null, "Please enter a number>>");
		num2 = Integer.parseInt(strNum1);
		
		strNum1 = JOptionPane.showInputDialog(null, "Please enter a number>>");
		num3 = Integer.parseInt (strNum1);
		
		strNum1 = JOptionPane.showInputDialog(null, "Please enter a number>>");
		num4 = Integer.parseInt (strNum1);
		
		answer = num1 + num2 + num3 + num4;
		
		JOptionPane.showMessageDialog(null, "And the total is... " + answer);
	}

}
