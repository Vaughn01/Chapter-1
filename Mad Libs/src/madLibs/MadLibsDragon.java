/**
 * 
 */
package madLibs;

import javax.swing.JOptionPane;

/**
 * @author tv111790
 *
 */
public class MadLibsDragon {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String color, wordEst, bodyPartPlural, animal, noun, pluralNoun, wholeNumber;
		
		int a = 81;
		int b = 36;
		int c;
		
		c = a - b;
		
		color = JOptionPane.showInputDialog(null, "What is your favorite color?");
		wordEst = JOptionPane.showInputDialog(null, "Type a word that ends in -est. ");
		bodyPartPlural = JOptionPane.showInputDialog(null, "List the weirdest body part you have. ");
		animal = JOptionPane.showInputDialog(null, "Name your favorite animal. ");
		noun = JOptionPane.showInputDialog(null, "Type of noun that least describes you. ");
		pluralNoun = JOptionPane.showInputDialog(null, "Type a Plural Noun. ");
		
		wholeNumber = JOptionPane.showInputDialog(null, "Give me anumber that is a whole number, that means NO DECIMALS!!! ");
		
		JOptionPane.showMessageDialog(null, "The " + color + " dragon is the " + wordEst + 
		" animal of the whole world. It has " + c +  bodyPartPlural + "s and a " + animal + " shaped like a " + noun + 
		" It loves to eat " + pluralNoun + " although he/she will feast nearly anything and anyone.");
		
		// TODO Auto-generated method stub

	}

}
