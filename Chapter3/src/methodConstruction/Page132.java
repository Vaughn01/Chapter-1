/**
 * 
 */
package methodConstruction;

/**
 * @author TV111790
 *
 */
public class Page132 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		double Salary = 200.00;
		double startingWage = 800.00;
		System.out.println("Demonstrating some raises");
		predictRaise(400.00);
		predictRaise(Salary);
		predictRaise(startingWage);
		

	}
	
	public static void predictRaise(double Salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = Salary * RAISE_RATE;
		System.out.println("Current salary : " + Salary + " After raise: " + newSalary);
	}
}
