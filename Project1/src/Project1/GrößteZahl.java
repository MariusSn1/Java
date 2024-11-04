package Project1;

// Schreiben Sie eine Java Klasse, welche aus 3 Intgern den größten als Konsolenausgabe zurückgibt

public class GrößteZahl {

	public static void main(String[] args) {
		
		int[] zahl = {74, -378, 21};
		int größteZahl = Integer.MIN_VALUE;
		
		for (int i = 0; i < zahl.length; i++) {
			if (zahl[i] > größteZahl) {
				größteZahl = zahl[i];
			}
		}
		
		System.out.println("Die größte Zahl = " + größteZahl);
		
	}

}
