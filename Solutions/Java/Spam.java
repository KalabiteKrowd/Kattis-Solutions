import java.util.*;

public class Spam {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String input = kb.next();
		int whiteSpace = 0;
		int lower = 0;
		int upper = 0;
		int symbol = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '_') {
				whiteSpace++;
			}
			else if (Character.isUpperCase(input.charAt(i))) {
				upper++;
			}
			else if (Character.isLowerCase(input.charAt(i))) {
				lower++;
			}
			else {
				symbol++;
			}
		}
		System.out.printf("%.15f\n", ((double)whiteSpace / input.length()));
		System.out.printf("%.15f\n", ((double)lower / input.length()));
		System.out.printf("%.15f\n", ((double)upper / input.length()));
		System.out.printf("%.15f\n", ((double)symbol / input.length()));
	}
}
