/**
 * 
 */
package gameZone;

import java.util.Random;

import javax.swing.JOptionPane;
/**
 * @author TV111790
 *
 */
public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int user;
		int computer;
		String message;
		String userPick;
		String computerPick; 
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 2;
		computer = r.nextInt(2) + LOW;
		user = Integer.parseInt(JOptionPane.showInputDialog(null, "Let's play Rock Paper Scissors! \nType the following numbers for rock paper scissors.\n0 for rock \n1 for paper \n2 for scissors."));
		
		if(user == 0 && computer == 0)
		{
			userPick = "rock";
			computerPick = "rock";
			message = "Tie";
			JOptionPane.showMessageDialog(null, "Well you both tied!!!! You are evenly matched!");
		}
		
		
		if(user == 1 && computer == 1)
		{
			userPick = "paper";
			computerPick = "paper";
			message = "Tie";
			JOptionPane.showMessageDialog(null, "Another tie! Can you break the tie?");
		}
		
		
		if(user == 2 && computer == 2)
		{
			userPick = "scissors";
			computerPick = "scissors";
			message = "Tie";
			JOptionPane.showMessageDialog(null, "A tie?! Oh, come on!!!!");
		}
		
		
		if(user == 0 && computer == 1)
		{
			userPick = "rock";
			computerPick = "paper";
			message = "You lose!";
			JOptionPane.showMessageDialog(null, "AWWWW, YOU LOST!!!! The computer is the master at rock paper scissors!");
		}
		
		
		if(user == 0 && computer == 2)
		{
			userPick = "rock";
			computerPick = "scissors";
			message = "You Win!!!";
			JOptionPane.showMessageDialog(null, "Great job! You went with your gut instinct.");
		}
		
		if(user == 1 && computer == 0)
		{
			userPick = "paper";
			computerPick = "rock";
			message = "You Win!!!";
			JOptionPane.showMessageDialog(null, "Congratulations, you win!!!! Pass GO and collect $200!!!");
		}
		
		
		if(user == 1 && computer == 2)
		{
			userPick = "paper";
			computerPick = "scissors";
			message = "You lose!";
			JOptionPane.showMessageDialog(null, "YOU LOST!!! You must pay $200 to the computer!");
		}
		
		
		if(user == 2 && computer == 0)
		{
			userPick = "scissors";
			computerPick = "rock";
			message = "You lose!";
			JOptionPane.showMessageDialog(null, "You meant the other one, didn't you?");
		}
		
		
		if(user == 2 && computer == 1)
		{
			userPick = "scissors";
			computerPick = "paper";
			message = "You Win!!!";
		JOptionPane.showMessageDialog(null, "Congratulations, you win!!!! You are the master at rock paper scissors!");
		}
		
		
	}
}

