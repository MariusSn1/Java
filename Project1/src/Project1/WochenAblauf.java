package Project1;

//Aufgabe:
//
//Erstellen Sie eine Klasse Wochenablauf, die per Switch-Case in der Konsole ausgibt was erledigt werden muss:
//
//Montag: Einkaufen
//
//Dienstag: Fortbildung
//
//Donnerstag: Sport
//
//Freitag: Party
//
//Sonntag: Freunde treffen
//
//Wenn nichts geplant ist dann wird sich um den Haushalt gekümmert. 

public class WochenAblauf {
	public static void main(String[] args) {
		String tag = "Freitag";
		switch (tag) {
		case "Montag": System.out.println("Einkaufen");
			break;
		case "Dienstag": System.out.println("Fortbildung");
			break;
		case "Donnerstag": System.out.println("Sport");
			break;
		case "Freitag": System.out.println("Party");
			break;
		case "Sonntag": System.out.println("Freunde treffen");
			break;
		default: System.out.println("um den Haushalt kümmern");
			break;
		} 
	}
}
