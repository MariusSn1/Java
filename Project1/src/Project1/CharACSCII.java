package Project1;

public class CharACSCII {

	public static void main(String[] args) {
		char symbol = 'Ö';
		System.out.println("Die ASCII Codierung für das Zeichen " + symbol + " ist: " + (int)symbol);
		long a = 263255215489711115l;
		byte b = 107;
		double c = 17894561468487.61497541793145925893974563275823143972174219743297512349723197432957297453217932975429731297429725975327492797459239754297;
		float d = (float)c;
		double e = 14.7;
		System.out.println(a + " " + b + "\t\t" + c + "\n\t\t\t\t" + d);
		System.out.println((int)e);
	}

}
