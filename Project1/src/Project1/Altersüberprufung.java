package Project1;
import java.util.Scanner;

public class Altersüberprufung {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie Ihr Alter ein");
		int alter = scanner.nextInt();	
		scanner.close();
		if (alter < 14) {
			System.out.println("Du darfst noch nicht Mofa fahren");
		}
		else if (alter < 16) {
			System.out.println("Du darfst Mofa fahren, aber nicht Moped");
		}
		else if (alter < 18) {
			System.out.println("Du darfst Moped fahren, aber nicht Auto");
		}
		else {
			System.out.println("Du darfst endlich Auto fahren!");
		}
	}
}
