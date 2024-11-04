package Project1;

/*Mithile der While-Schleife geben Sie folgeden Zahlenstränge aus:
    0, 1, 2, 3, …, 10
    -10, -8, -6, …, +10
    1, 2, 4, 8, … bis 512
 */

public class WhileSchleife {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.print("\n");
		i = -10;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.print("\n");
		i = 1;
		while (i <= 512) {
			System.out.print(i + " ");
			i *= 2;
		}
	}

}
