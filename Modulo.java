import java.util.*;

public class Modulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean[] occupied = new boolean[42];
		while(input.hasNext()) {
			occupied[input.nextInt() % 42] = true;
		}
		int total = 0;
		for (int i = 0; i < 42; i++) {
			if (occupied[i])
				total++;
		}
		System.out.println(total);
	}
}
