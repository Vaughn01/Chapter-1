/**
 * 
 */
package delgadosTacos;

import java.util.Scanner;

/**
 * @author TV111790
 *
 */
public class DelgadosChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		{
			tacoTruck();
			menu();
			orderingMenu();
		}
		}
		
		public static void orderingMenu()
		/* This is where in the program I decided to make sure the program knew the price and amount of each item. 
		 * I had to come up with 10 different items and make the prices of each.*/
			{
				String Burrito, Taco, Enchilada, Churro, Fajitas, Lemonade, Chimichango, Water, Soda, choiceYes = null;
				
				double BurritoPrice = 2.39;
				double TacoPrice = 1.49;
				double EnchiladaPrice = 2.99;
				double ChurroPrice = 1.99;
				double FajitasPrice = 2.99;
				double LemonadePrice = 0.49;
				double ChimichangoPrice = 3.09;
				double WaterPrice = 0.00;
				double SodaPrice = 0.99;
				double TaquitoPrice = 1.49;
				double totalPrice;
				double burritoOrdered = 0;
				double taquitoOrdered = 0;
				double tacoOrdered = 0;
				double enchiladaOrdered = 0;
				double churroOrdered = 0;
				double fajitasOrdered = 0;
				double lemonadeOrdered = 0;
				double chimichangoOrdered = 0;
				double watersOrdered = 0;
				double sodaOrdered = 0;
				int orderNumber;
				int burritoNum = 2;
				int tacoNum = 1;
				int enchiladaNum = 10;
				int churroNum = 3;
				int fajitasNum = 4;
				int lemonadeNum = 5;
				int chimichangoNum = 6;
				int waterNum = 7;
				int sodaNum = 8;
				int taquitoNum = 9;
				/* This is where in the program the user tells the program how many of each they would like. */
				
				Scanner inputDevice = new Scanner(System.in);
				System.out.println("Hello welcome to Taty's Taco Truck!");
				System.out.println("From the menu, what would you like to order?");
				System.out.println("Please select the number from each item");
				orderNumber = inputDevice.nextInt();
				
				totalPrice = (BurritoPrice * burritoOrdered) + (TacoPrice * tacoOrdered) + (EnchiladaPrice * enchiladaOrdered) 
						   + (ChurroPrice * churroOrdered) + (FajitasPrice * fajitasOrdered) + (LemonadePrice * lemonadeOrdered) 
						   + (ChimichangoPrice * chimichangoOrdered) + (WaterPrice * watersOrdered) + (SodaPrice * sodaOrdered) 
						   + (TaquitoPrice * taquitoOrdered);
				
				double TotalPriceWithTaxes = (totalPrice + 1.075);
				if(orderNumber == 2)
					{
						System.out.println("How many burritos would you like?");
						burritoOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
						
					}
				
				if(orderNumber == 1)
					{
						System.out.println("How many tacos would you like?");
						tacoOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 10)
					{
						System.out.println("How many enchiladas would you like?");
						enchiladaOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 3)
					{
						System.out.println("How many churros would you like?");
						taquitoOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 4)
					{
						System.out.println("How many fajitas would you like?");
						churroOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 5)
					{
						System.out.println("How many lemonades would you like?");
						fajitasOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 6)
					{
						System.out.println("How many chimichango would you like?");
						lemonadeOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 7)
					{
						System.out.println("How many water would you like?");
						chimichangoOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 8)
					{
						System.out.println("How many soda would you like?");
						watersOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				
				if(orderNumber == 9)
					{
						System.out.println("How many taquitos would you like?");
						sodaOrdered= inputDevice.nextDouble();
						inputDevice.nextLine();
						System.out.println("Would you like anything else? Yes or No");
				if("Yes".equals(choiceYes))
						{
							System.out.println("Please select the number from each item");
							orderNumber = inputDevice.nextInt();
						}
				else
						{
							System.out.println("According to what you ordered, you have ordered " + tacoOrdered + " tacos for " +  TacoPrice 
									+ ", " + burritoOrdered + " burritos for " +  BurritoPrice + ", " + enchiladaOrdered + " enchiladas for " 
									+  EnchiladaPrice + ", "	+ churroOrdered + " \r1"
											+ "churros for " +  ChurroPrice + ", " + fajitasOrdered 
									+ " fajitas for " +  FajitasPrice + ", "+ lemonadeOrdered + " lemonade for " +  LemonadePrice + ", "
									+ chimichangoOrdered + " chimichangos for " +  ChimichangoPrice + ", "	+ watersOrdered + " waters for " 
									+  WaterPrice + ", " 	+ taquitoOrdered + " taquito for " +TaquitoPrice + ".\r1"
											+ " That gives you a total of $" 
									+ totalPrice	+ ". With tax it is a grand total of $" + TotalPriceWithTaxes);
						}
					}
				else
				{
					System.out.println("Have A Nice Day!!!");
				}
				
				
		}
			
	public static void tacoTruck()
	/* This is my taco truck drawing. Isn't it pretty? */
	{
		System.out.println("            Hello World!!!!!");
		System.out.println("***********************************");
		System.out.println("*       Taty's Taco Truck         *");
		System.out.println("*                                 *");
		System.out.println("*       **********************    *");
		System.out.println("*       *       ooooo        *    *");
		System.out.println("*       *       o   o        *    *******************");
		System.out.println("*       *       ooooo        *                       *");
		System.out.println("*       *         o          *             *******    *");
		System.out.println("*       **********************             *     *     *");
		System.out.println("*                                          *    **    *");
		System.out.println("*   oooooo                          ooooo  *     *  *");
		System.out.println("****o    o*************************o    o************");
		System.out.println("    o    o                         o    o            ");
		System.out.println("    oooooo                         oooooo            ");
	}

	public static void menu()
	/* This is the menu for my taco truck. Do you think this is too expensive? */
	{
		System.out.println("************************************");
		System.out.println("*                                  *");
		System.out.println("*            Food Menu             *");
		System.out.println("*   1     Taco Price = 1.49;       *");
		System.out.println("*   2    Burrito Price = 2.39      *");
		System.out.println("*   3    Churro Price = 1.99       *");
		System.out.println("*   4   Fajitas Price = 2.99       *");
		System.out.println("*   5   Lemonade Price = 0.49      *");
		System.out.println("*   6  Chimichango Price = 3.09    *");
		System.out.println("*   7   Water Price = 0.00         *");
		System.out.println("*   8   Soda Price = 0.99          *");
		System.out.println("*   9   Taquito Price = 1.49       *");
		System.out.println("*  10  Enchilada Price = 2.99      *");
		System.out.println("*                                  *");
		System.out.println("************************************");

		
	}
	}
