package Project1;

public class Factorial {

	public static void main(String[] args) {
		//
		int input = 11;		
		System.out.println(factorial(input));
	}
	
	public static long factorial (int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}

}
