package Project1;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = new char[10]; 
		char currentChar = 'a';
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] = currentChar;
			System.out.print((int)charArray[i] + " ");
			currentChar++;
		}
		
	}

}
 