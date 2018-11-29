import java.util.*;
import java.math.*;

public class CoprimeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();

		int count = 0;
		for (int i = A; i <= B; i++) {
			for (int j = C; j <= D; j++) {
				if (factor(i, j)) {
					count++;
				}//if
			}//for
		}//for
		System.out.println(count);
	}

	public static boolean factor(int a, int b) {
		if (a == b && a != 1)
			return false;
		for (int i = 2; i < (int)Math.sqrt(Math.max(a, b)); i++) {
			if (a % i == 0 && b % i == 0) {
				return false;
			}
		}
		return true;
	}

}
