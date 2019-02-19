import java.util.*;

public class A1paper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int smallest = input.nextInt();
		int[] papers = new int[smallest -1];
		double sum = 0;
		for (int i = 0; i < papers.length; i++) {
			papers[i] = input.nextInt();

		}//for
		checkPossible(papers);


	}

	public static boolean checkPossible(int[] papers) {
		for (int i = papers.length -1; i >0; i--) {
			papers[i -1] += papers[i] / 2;
		}
		if (!(papers[0] > 2)) {
			return false;
		}
		return true;
	}
}
