import java.util.Scanner;

public class R2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r1 = input.nextInt();
		int mean = input.nextInt();
		mean *= 2;
		mean -= r1;
		System.out.println(mean);
	}
}
