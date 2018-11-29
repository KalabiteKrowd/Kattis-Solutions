import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number, i;
	sc = new Scanner(System.in);
		
	System.out.println("Please Enter any number to Find Factors: ");
	Number = sc.nextInt();
		
	int result = discover(Number);
	System.out.println(result);

    }

	public static int discover(int number) {
		for (int i = 2; i <= number; i++) {
			if (number % i == 0)
				return 1 + discover(number / i);	
		}
		return 0;
	}

}
