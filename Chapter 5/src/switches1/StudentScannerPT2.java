/**
 * 
 */
package switches1;

import javax.swing.JOptionPane;

/**
 * @author TV111790
 *
 */
public class StudentScannerPT2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String studentString;
		int studentNumber;
		
		
		studentString = (String)JOptionPane.showInputDialog("Please Scan item here>>>");
		
		studentNumber = Integer.parseInt(studentString);
		if(studentNumber >= 100000 || studentNumber <= 4000000)
		
		{switch(studentString)
		
			{
		case "274896":
			JOptionPane.showMessageDialog(null, "Its Andrew McKenzie");
			break;
		case "274885":
			JOptionPane.showMessageDialog(null,"It's Charles Carlsrom!");
			break;
		case "316282":
			JOptionPane.showMessageDialog(null,"It's Ress Alzahrani!");
			break;
		case "274884":
			JOptionPane.showMessageDialog(null,"It's ME!");
			break;
		case "133778":
			JOptionPane.showMessageDialog(null,"It's Nick Hasson!");
			break;
		case "131457":
			JOptionPane.showMessageDialog(null,"It's Kassie Remley!");
			break;
		case "137412":
			JOptionPane.showMessageDialog(null,"It's Sebastion Frick!");
			break;
		case "131147":
			JOptionPane.showMessageDialog(null,"It's Zach Dorris!");
			break;
		case "274887":
			JOptionPane.showMessageDialog(null,"It's Chase Kress!");
		break;
		case "133225":
			JOptionPane.showMessageDialog(null,"It's Isaiah Ponciano!");
		break;
		case "137428":
			JOptionPane.showMessageDialog(null, "It's Mason Hancock!");
		break;
		default: 
			JOptionPane.showMessageDialog(null, "IT DOES NOT EXIST!!");
	
		}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "That number is way too high!!");
		}
		
		

	}

}
