/**
 * 
 */
package programmingExercises;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class CondoSales2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		
		String choiceYes;
		
		String view;
		
		double garage = 5000;
		
		double ParkView = 150000;
		
		double GolfCourseView = 170000;
		
		double LakeView = 210000;
		
		double invalid = 0; 
		
		int orderNumber;
		
		Scanner input = new Scanner (System.in);
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Hello welcome to Condo Sales!");
		System.out.println("Would you like the golf course view, park view, or lake view for your condominium?");
		System.out.println("Please select the number from each item.\n Press 1 for park view. \n Press 2 for the golf course view. \n Press 3 the lake view.");
		orderNumber = inputDevice.nextInt();
		
		System.out.print("Would you like to buy a condominium? Yes or No");
		choiceYes = input.nextLine();
		
		if ("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "y".equals(choiceYes) || "Y".equals(choiceYes))
				{
				System.out.print("You have said " + choiceYes + " to buying a condo. Fantastic!!!");
				System.out.print("Which view would you like? ");
				orderNumber = input.nextInt();
				
				if("small".equals(view) || "medium".equals(view) || "large".equals(view) || "extra large".equals(view))
					{
					System.out.print("You have said " + view + ". ");
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
			System.out.println("Have a nice day!");
		}
		
		

	}

}
