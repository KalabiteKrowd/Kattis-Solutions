import java.util.*;

public class leftRight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.nextInt();
		String order = input.next();
		int counter = 1;
		int tmp;
		int i = 0;

		if (order.charAt(0) == 'L') {
			while (counter < order.length() && 'L' == order.charAt(counter)) {
				counter++;
			}
			tmp = counter + 1;
			while (tmp > 0) {
				System.out.println(tmp);
				tmp--;
			}
			i = counter;
		}
		else
			System.out.println(1);
		
		while (i < order.length()) {
			counter = 1;
			while (i + counter < order.length() && order.charAt(i) != order.charAt(i + counter)) {
				counter++;
			}//while
			tmp = i + counter;//saves where next right is
			while (counter > 0) {
				System.out.println(i + counter + 1);
				counter--;
			}//while
			i = tmp;
		}//for
	}
}
