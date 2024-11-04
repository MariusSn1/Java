package Project1;

/* b) Schreiben Sie eine Klasse die je nach Jahreszeit und Temperatur bestimmt ob es für den Monat warm oder kalt ist.

    März April Mai (Frühling  >=20 warm  <20 kalt)
    Juni Juli August (Sommer >= 25 warm <20 kalt)
    September Oktober November (Herbst >=15 warm <15 kalt)
    Dezember Januar Februar (Winter >=5 warm <5 kalt)

    Monate als int
    Jahreszeit als String
    Temperatur als double

    Ausgabe: Der "monat" ist mit "temperatur"°C für diese "jahreszeit" realtiv "temperaturempfinden"
 */

public class Temperatur {
	
	public static void main(String[] args) {
		
		int monat = 7;
		String jahresZeit;
		double temperatur = 15.7;
		switch (monat) {
			case 3, 4, 5:
				jahresZeit = "Frühling";
				break;
			case 6, 7, 8:
				jahresZeit = "Sommer";
				break;
			case 9, 10, 11:
				jahresZeit = "Herbst";
				break;
			case 12, 1, 2:
				jahresZeit = "Winter";
				break;
			default:
				jahresZeit = "ungültig";
				break;
		}
		
		if (jahresZeit == "Frühling") {
			System.out.println("Der " + monat + ". Monat ist mit " + temperatur + "°C für " + jahresZeit + " relativ " + ((temperatur >= 20) ? "warm" : "kalt"));
		}
		else if (jahresZeit == "Sommer") {
			System.out.println("Der " + monat + ". Monat ist mit " + temperatur + "°C für " + jahresZeit + " relativ " + ((temperatur >= 25) ? "warm" : "kalt"));	
		}
		else if (jahresZeit == "Herbst") {
			System.out.println("Der " + monat + ". Monat ist mit " + temperatur + "°C für " + jahresZeit + " relativ " + ((temperatur >= 15) ? "warm" : "kalt"));
		}
		else if (jahresZeit == "Winter") {
			System.out.println("Der " + monat + ". Monat ist mit " + temperatur + "°C für " + jahresZeit + " relativ " + ((temperatur >= 5) ? "warm" : "kalt"));
		}
		else {
			System.out.println(monat + " ist kein gültiger Monat");
		}
		
	}
}
