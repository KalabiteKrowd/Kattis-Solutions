import java.util.*;   

public class Autori {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inString = input.next();
		char tmp;
		for (int i = 0; i < inString.length(); i++) {
			tmp = inString.charAt(i);
			if (Character.isUpperCase(tmp))
				System.out.print(tmp);
		}
	}
}
