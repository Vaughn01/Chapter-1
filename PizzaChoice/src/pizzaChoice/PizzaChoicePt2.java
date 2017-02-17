/**
 * 
 */
package pizzaChoice;

import javax.swing.JOptionPane;

/**
 * @author TV111790
 *
 */
public class PizzaChoicePt2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int choiceYes;
		int size;
		int pizzaKind;
		double smallCost = 3.29;
		double smallPizza;
		double mediumCost = 4.29;
		double mediumPizza;
		double largeCost = 4.79;
		double largePizza;
		double extraLargeCost = 5.99;
		double extraLargePizza;
		double pepperoniCost = 0.00;
		double sausageCost = 0.00;
		double veggieCost = 0.29;
		double meatLoversCost = 0.59;
		double totalCost; 
		
		choiceYes = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to order a pizza? Yes or No"));
		
		if ("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "y".equals(choiceYes) || "Y".equals(choiceYes))
				{
			JOptionPane.showMessageDialog(null, "You have said " + choiceYes + " to having a pizza");
			JOptionPane.showMessageDialog(null, "What size would you like? Small, medium, large, or extra large ");
				size = input.nextLine();
				
				if("small".equals(size) || "medium".equals(size) || "large".equals(size) || "extra large".equals(size))
					{
					System.out.print("You have said " + size + ". ");
					System.out.print("What kind of pizza would you like? Pepperoni, Sausage, Cheese, Veggie, Meat Lovers");
					pizzaKind = input.nextLine();
		
					if ("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Veggie".equals(pizzaKind) || "Meat Lovers".equals(pizzaKind) || "Cheese".equals(pizzaKind))
						{
						System.out.print(size + " sounds so delicious. \n Your order will consist of " + size + "pizza, with the toppings of " + pizzaKind);
						}
						if("small".equals(size))
							{
								System.out.println("Your pizza will cost " + smallCost);
							}
						if("medium".equals(size))
							{
								System.out.println("Your pizza will cost " + mediumCost);
							}
						if("large".equals(size))
							{
								System.out.println("Your pizza will cost " + largeCost);
							}
						if("extraLarge".equals(size))
							{
								System.out.println("Your pizza will cost " + extraLargeCost);
							}
					}
				
				}
		else 
		{
			System.out.println("If you would not like to order pizza, have a nice day!");
		}
		
		
	}

}
