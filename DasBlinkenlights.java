import java.util.*;

public class DasBlinkenlights {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p = input.nextInt();
		int q = input.nextInt();
		int s = input.nextInt();
		if (LCM(p, q) <= s)
			System.out.println("yes");
		else
			System.out.println("no");
	}

	public static int GCD(int a, int b) {
	
		//0 is a homewrecker
		if (a == 0 || b == 0)
			return 0;

		//base case
		if (a == b)
			return a;
		else if (a > b)
			return GCD(a-b, b);
		else
			return GCD(a, b-a);
	}

	public static int LCM(int a, int b) {
		return a * (b / GCD(a, b));
	}
}
