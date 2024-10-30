package Project1;

public class Schaltjahr {

	public static void main(String[] args) {
		int jahr = 2000;
//		if (jahr % 4 == 0) {
//			if (jahr % 100 == 0) {
//				if (jahr % 400 == 0) {
//					System.out.println("Schaltjahr");
//				}
//				else {
//					System.out.println("Kein Schaltjahr");
//				}
//			}
//			else {
//				System.out.println("Schaltjahr");
//			}
//		}
//		else {
//			System.out.println("Kein Schaltjahr");
//		}
		if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
			System.out.println("Schaltjahr");
		}
		else {
			System.out.println("Kein Schaltjahr");
		}
	}

}
