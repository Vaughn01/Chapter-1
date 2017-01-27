/**
 * 
 */
package helloNameDialog;
import javax.swing.JOptionPane;
/**
 * @author TV111790
 *
 */
public class HelloNameDialog 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String result;
		
		result = JOptionPane.showInputDialog(null, "What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello," + result + "!");
		// TODO Auto-generated method stub

	}

}
