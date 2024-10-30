package Project1;

public class Scheinausgabe {

	public static void main(String[] args) {
		int moneyAmount = 1058;
		int[] noteValue = {500, 200, 100, 50, 20, 10, 5};
		int[] noteAmount = new int[noteValue.length];
		System.out.println("Geldbetrag: " + moneyAmount);
		for (int i = 0; i < noteValue.length; i++) {
			if (moneyAmount / noteValue[i] > 0) {
				noteAmount[i] = moneyAmount / noteValue[i];
				moneyAmount = moneyAmount % noteValue[i];
				System.out.println(noteValue[i] + "er-Scheine: " + noteAmount[i]);
			}
		}
		System.out.println("Rest: " + moneyAmount);
	}

}
