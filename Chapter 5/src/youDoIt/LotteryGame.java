/**
 * 
 */
package youDoIt;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author TV111790
 *
 */
public class LotteryGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 9;
		String message = null;
		int result = r.nextInt(9) + LOW;
		int result2 = r.nextInt(9) + LOW;
		int result3 = r.nextInt() + LOW;
		int guess;
		int guess2;
		int guess3;
		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess the number I am thinking of between" + LOW + " and " + HIGH));
		guess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Let's Try Again! Try to guess the number I am thinking of between" + LOW + " and " + HIGH));
		guess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Can you do again? Try to guess the number I am thinking of between" + LOW + " and " + HIGH));
		

		if(guess == result && guess2 == result2 && guess3 == result3)
		{
			message = "\n Congratulations! You have got all three matches!!! You get a $1,000,000!!!";
		}
		else 
			if(guess <= result && guess2 <= result2 && guess3 == result3 || guess <= result && guess2 >= result2 && (guess3 == result3 ||
					(guess >= result) && (guess2 <= result2) && (guess3 == result3) || (guess >= result) && (guess2 >= result2) && (guess3 == result3) ||
					(guess == result) && (guess2 <= result2) && (guess3 <= result3) || (guess == result) && (guess2 >= result2) && (guess3 <= result3) ||
					(guess == result) && (guess2 <= result2) && (guess3 >= result3) || (guess == result) && (guess2 >= result2) && (guess3 >= result3) ||
					(guess <= result) && (guess2 == result2) && (guess3 <= result3) || (guess >= result) && (guess2 == result2) && (guess3 <= result3) ||
					(guess >= result) && (guess2 == result2) && (guess3 <= result3) || (guess >= result) && (guess2 == result2) && (guess3 >= result3)))
				{
					message = "\n Congratulations! You have got one out of three matches!!! You get $10!!!";
				}
		
			if(guess <= result && guess2 == result2 && guess3 == result3 || guess >= result && guess2 == result2 && guess3 == result3 ||
			guess == result && guess2 <= result2 && guess3 == result3 || guess == result && guess2 >= result2 && guess3 == result3 ||
			guess == result && guess2 == result2 && guess3 <= result3 || guess == result && guess2 == result2 && guess3 >= result3)
				{
					message = "\n Congratulations! You have got two out of three matches!!! You get $100";
				}
		
			if(guess == result && guess2 == result3 && guess3 == result2 || guess == result && guess2 == result3 
					&& guess3 == result2 || guess == result2 && guess2 == result && guess3 == result3 || guess == result2 && guess2 == result3 
					&& guess3 == result || guess == result3 && guess2 == result && guess3 == result2 || guess == result3 && guess2 == result2 && guess == result)
				{
					message = "\n OOOOH... you were so close!!!! You have got all three matches but you mixed them up!!! It's okay \n you will get a $1000 award.";
				}
			if(guess != result && guess2 != result2 && guess3 != result3)
				{
					message = "\n Congratulations! You have got all three matches!!! You get a $1,000,000!!!";
				}

	}

}
