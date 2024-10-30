package Project1;
/*
 * Implementieren Sie per Switch case ein Programm, dass die Anzahl der Tage eines Monats ausgibt.
 * Ob ein Schaltjahr ist bestimmt der boolean Jahr.
 */

public class Aufgabe4 {

	public static void main(String[] args) {
		int monat = 9;
		boolean istschaltjahr = true;
		switch (monat) {
		case 1, 3, 5, 7, 8, 10, 12: System.out.println("Der " + monat + ". Monat des Jahres hat 31 Tage");
			break;
		case 4, 6, 9, 11: System.out.println("Der " + monat + ". Monat des Jahres hat 30 Tage");
			break;
		case 2: if (istschaltjahr == true) {
			System.out.println("Der " + monat + ". Monat des Jahres hat 29 Tage (Schaltjahr)");
			}
			else {
				System.out.println("Der " + monat + ". Monat des Jahres hat 28 Tage");
			}
			break;
		default: System.out.println(monat + ". Monat gibt es nicht");
			break;
		}
	}

}
