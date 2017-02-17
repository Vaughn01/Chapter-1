/**
 * 
 */
package pizzaChoice;

import java.util.Scanner;
/**
 * @author TV111790
 *
 */
public class PizzaChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String choiceYes;
		String size;
		String pizzaKind;
		double smallCost = 3.29;
		
		double mediumCost = 4.29;
		
		double largeCost = 4.79;
		
		double extraLargeCost = 5.99; 
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Would you like a pizza? Yes or No   ");
		choiceYes = input.nextLine();
		
		if ("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "y".equals(choiceYes) || "Y".equals(choiceYes))
				{
				System.out.print("You have said " + choiceYes + " to having a pizza");
				System.out.print("What size would you like? Small, medium, large, or extra large ");
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
