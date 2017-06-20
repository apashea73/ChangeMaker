//A program that will return change and report the number of coins: quarters, dimes, nickels, and pennies.
import java.util.Scanner;
public class ChangeMaker {

	public static void main(String[] args)
	{ 	
	int amount, originalAmount,
	quarters, quartermod, quartervalue, dimes, dimemod, dimevalue, nickels, nickelmod, nickelvalue, pennies;
	
	System.out.println("Enter a whole number from 1 to 99.");
	System.out.println("I will return the number of coins");
	System.out.println("that equals that amount of change.");
	
	Scanner keyboard = new Scanner(System.in);
	amount = keyboard.nextInt();	
	
	originalAmount = amount;
	quarters = amount / 25;
	quartermod = amount % 25;
	quartervalue = quarters*25;
	dimes = quartermod / 10;
	dimemod = quartermod % 10;
	dimevalue = dimes*10;
	nickels = dimemod / 5;
	nickelmod = nickels % 5;
	nickelvalue = nickels*5;
	pennies = (originalAmount - quartervalue - dimevalue - nickelvalue);
				
	System.out.println(originalAmount + " cents in coins can be given as:");
	System.out.println(quarters + " quarters");
	System.out.println(dimes + " dimes");
	System.out.println(nickels + " nickels and");
	System.out.println(pennies + " pennies");
	}
}
