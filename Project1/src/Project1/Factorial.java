package Project1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 11;		
		int output = factorial(input);
		System.out.println(output);

	}
	
	public static int factorial (int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}

}
