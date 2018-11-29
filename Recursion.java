import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	}

	public static int recSum(int num, int acc) {
		if (num == 0)
			return acc;
		return recSum(num / 10, acc + num % 10);
	}

}
