import java.util.*;

public class TakeTwoStones {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int stones = input.nextInt();

		if (stones % 2 == 1)
			System.out.println("Alice");
		else
			System.out.println("Bob");
	}
}
