import java.util.*;
import java.math.*;

public class Sibice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matches = input.nextInt();
		int width = input.nextInt();
		int height = input.nextInt();
		double max = Math.sqrt(((double)width * width) + ((double)height * height));

		for (int i = 0; i < matches; i++) {
			if (input.nextInt() <= max) 
				System.out.println("DA");
			else 
				System.out.println("NE");
		}
	}
}
