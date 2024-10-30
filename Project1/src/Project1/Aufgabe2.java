package Project1;

/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 *We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
*/


public class Aufgabe2 
{
	public static void main(String[] args) 
	{
		boolean aSmile = true;
		boolean bSmile = true;
		
		if (aSmile == bSmile) {
			System.out.println("We are in trouble");
		}
		else {
			System.out.println("No trouble");
		}
	}
}
