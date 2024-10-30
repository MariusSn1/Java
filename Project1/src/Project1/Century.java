package Project1;

/*
 * Geben Sie das Jahrhundert zurück, in dem sich eine Jahreszahl befindet.
 * Das erste Jahrhundert reicht vom Jahr 1 bis einschließlich zum Jahr 100,
 * das zweite vom Jahr 101 bis einschließlich zum Jahr 200, usw.
 */

public class Century {
	public static void main(String[] args) {
		Century c = new Century();
		int year = 1905;
		System.out.print("Year " + year + "\nCentury: " + c.yearToCentury(year));
	}
	
	int yearToCentury(int year) {
		int century = 0;
		
		// Ihre Lösung
		
		century = (year--) / 100 + 1;
		
		return century;
	}
}
