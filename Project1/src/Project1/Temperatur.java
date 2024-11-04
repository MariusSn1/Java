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
		
		int monat = 12;
		String jahresZeit;
		String temperaturEmpfinden;
		double temperatur = 10.7;
		switch (monat) {
			case 3, 4, 5:
				jahresZeit = "Frühling";
				temperaturEmpfinden = (temperatur >= 20) ? "warm" : "kalt";
				break;
			case 6, 7, 8:
				jahresZeit = "Sommer";
				temperaturEmpfinden = (temperatur >= 25) ? "warm" : "kalt";
				break;
			case 9, 10, 11:
				jahresZeit = "Herbst";
				temperaturEmpfinden = (temperatur >= 15) ? "warm" : "kalt";
				break;
			case 12, 1, 2:
				jahresZeit = "Winter";
				temperaturEmpfinden = (temperatur >= 5) ? "warm" : "kalt";
				break;
			default:
				jahresZeit = "ungültig";
				temperaturEmpfinden = "nicht verfügbar";
				break;
		}
		System.out.println((jahresZeit != "ungültig") ? ("Der " + monat + ". Monat ist mit " + temperatur + "°C für " + jahresZeit + " relativ " + temperaturEmpfinden) : (monat + " ist kein gültiger Monat"));
		
	}
}
