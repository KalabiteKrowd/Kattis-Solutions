import java.util.*;
import java.math.*;

public class Difference {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long val1;
		long val2;
		while (input.hasNext()) {
			val1 = input.nextLong();
			val2 = input.nextLong();
			System.out.println(Math.abs(val2 - val1));
		}
	}
}
