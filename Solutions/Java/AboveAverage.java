import java.util.*;

public class AboveAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int size;
		double avg;
		int sum = 0;
		int[] nums;
		for (int i = 0; i < cases; i++) {
			size = input.nextInt();
			nums = new int[size];
			//finds sum
			for (int j = 0; j < size; j++) {
				nums[j] = input.nextInt();
				sum += nums[j];
			}
			avg = sum / size;

			sum = 0;
			for (int j = 0; j < size; j++) {
				if (nums[j] > avg) 
					sum++;
			}
			
			avg = 100.0 * sum / size;
			System.out.printf("%.3f", avg);
			System.out.println("%");
			sum = 0;
		}
	}
}
