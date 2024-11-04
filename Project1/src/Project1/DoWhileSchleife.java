package Project1;

/*
   Mithile der do While-Schleife geben Sie folgeden Zahlenstränge aus:
    0, 1, 3, 6, 10, 15, 21 ... (<100)
    0, 1, 4, 9, 16, 25, 36 ... (<100)
   Fibonacci Zahlenfolge

 */

public class DoWhileSchleife {

	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		do {
			System.out.print(j + " ");
			j = j+i;
			i++;
		} while (j<100);
		System.out.println();
		i = 1;
		j = 0;
		do {
			System.out.print(j + " ");
			j = j+i;
			i += 2;
		} while (j<100);
		System.out.println();
		i = 1;
		j = 0;
		do {
			System.out.print(j + " ");
			j = j+i;
			i = j-i;
		} while (j<100);
	}

}
