import java.util.*;   

public class Dvoniz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int maxSum = input.nextInt();
		
		//read in sequence
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = input.nextInt();
			System.out.println("nums[i]: " + nums[i]);
		}
		
		System.out.println("size:" + size);
		System.out.println("maxSum: " + maxSum);

		int sum1 = 0;
		int sum2 = 0;
		int j;
		//for each index
		for (int i = 0; i < size; i++) {

			sum1 = 0;
			sum2 = 0;
			j = 0;

			for (j = 0; j < ((size - i) / 2); j++) {
				sum1 += nums[j + i];
				sum2 += nums[((size + i) / 2) + j];

				if (sum1 > maxSum || sum2 > maxSum) {
					j--;
					break;
				}
				System.out.println(j * 2);
			}//for j
		}//for i
	}//main

}//class

