import java.lang.Math;
import java.util.Scanner;


public class absolute {

	public static void main (String[] args) {
		Scanner source = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		while (source.hasNext()) {
			a = source.nextInt();
			b = source.nextInt();
			sum = Math.abs(b - a);
			System.out.println(sum);
			//use abs(int)
		}
		
	}


}
