import java.util.*;
import java.math.*;

public class AlmostPerfect {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			chkPerfect(input.nextInt());
		}
	}

	public static void chkPerfect(int num) {
		int sum = 0;
		int max = num; //this num is counted by the num /i below
		for (int i = 2; i < max; i++) {
			if (num % i == 0) {		//if divisible
				if (i != num / i)	//not square
					sum += i + num / i;// ex/ 14 has 1 2 4 7 14 so if i = 1 i/num = 28 and when i = 2 i/num=14 i=4 i/num = 7
				else
					sum += i;	//dont count squares twice
				max = num / i;		//move the last number
			}
		}
		sum++;//above does not account for 1 * num so you must add 1 
		if (sum == num)
			System.out.println(num + " perfect");
		else if (Math.abs(num - sum) <= 2)
			System.out.println(num + " almost perfect");
		else
			System.out.println(num + " not perfect");
	}
}
