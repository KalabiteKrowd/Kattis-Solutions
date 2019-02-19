import java.util.*;   

public class Zamka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int L = input.nextInt();
		int D = input.nextInt();
		int X = input.nextInt();
		for (int i = L; i <= D; i++) {
			if (sumDigits(i) == X) {
				System.out.println(i);
				break;
			}
		}
		for (int i = D; i >= L; i--) {
			if (sumDigits(i) == X) {
				System.out.println(i);
				break;
			}
		}
	}

	public static int sumDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}

