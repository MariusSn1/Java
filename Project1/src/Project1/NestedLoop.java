package Project1;

public class NestedLoop {
	
	public static void main(String[] args) {
		int rows = 4;
		int columns = 1;
		int num = 1;
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(num + " ");
				num++;
			}
			columns++;
			System.out.println();
		}
	}
}
