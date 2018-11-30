import java.util.*;   

public class Fakktor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int articles = input.nextInt();
		int impact = input.nextInt();
		int citations = 0;
		while (impact != Math.ceil((double)citations / articles)) {
			citations++;
		}
		System.out.println(citations);
	}
}
