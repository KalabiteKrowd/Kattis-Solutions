import java.util.*;

public class savingforretirement {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bobAge = input.nextInt();
		int bobRetAge = input.nextInt();
		int bobSaves = input.nextInt();
		int bobSum = 0;
		for (int i = bobAge; i < bobRetAge; i++) {
			bobSum += bobSaves;	
		}

		int aliceAge = input.nextInt();
		int aliceSaves	= input.nextInt();
		int aliceSum = 0;
		while (aliceSum <= bobSum) {
			aliceSum += aliceSaves;
			aliceAge++;
		}
		System.out.println(aliceAge);
	
	}
}
