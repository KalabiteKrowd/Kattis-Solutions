import java.util.*;
import java.math.*;

public class ListGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int count = 0;

		for (int i = 2; i <= Math.sqrt(X); i++) {
			while (X % i == 0) {
				count++;
				X = X / i;
			}
		}
		if (X > 2) 
			count++;
		System.out.println(count);
	}
}
