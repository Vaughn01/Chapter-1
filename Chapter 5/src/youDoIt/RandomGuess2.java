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
public class RandomGuess2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 100;
		final int HIGH = 1000;
		String message = null;
		int result = r.nextInt(100) + LOW;
		int guess;
		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess the number I am thinking of between" + LOW + " and " + HIGH));
		
		if(guess == result)
		{
			message = "\nCongratulations, you got the right number!";
		}
		
			else
				if (result > guess)
				{
					message = "\n Your guess was too low";		
				}
			else
				if(result < guess)
					{
					message = "\n Your guess was too high";
					}
		JOptionPane.showMessageDialog(null, "The number is " + result + message);

	}

}
