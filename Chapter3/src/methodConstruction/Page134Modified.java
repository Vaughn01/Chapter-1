/**
 * 
 */
package methodConstruction;

import javax.swing.JOptionPane;
/**
 * @author TV111790
 *
 */
public class Page134Modified {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String valueString;
		char vType = 'S';
		int value ;
		double commRate = 0.08;
		
		
		 valueString = JOptionPane.showInputDialog(null, "What type of vehicle are you looking information for? ");
		 value = Integer.parseInt(valueString);
		 computeCommission(value, commRate, vType);
		 computeCommission(40000, 0.10, 'L');

	}
	public static void computeCommission(int value, double rate, char vehicle)
	{
		double commission;
		commission = value * rate;
		System.out.println("\n The " + vehicle + " type of vehicle is worth $" + value);
		System.out.println( "With " + (rate * 100) + "% commission rate, the commission is $" + commission);
	}

}
