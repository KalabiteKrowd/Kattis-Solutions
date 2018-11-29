import java.util.Scanner;
import java.util.Arrays;

public class ABC {
    public static void main(String[] args) {
	int[] input = new int[3];
        Scanner sc = new Scanner(System.in);
        input[0] = sc.nextInt();
	input[1] = sc.nextInt();
	input[2] = sc.nextInt();
	Arrays.sort(input); //sorts the array
	String order = sc.next();
	System.out.print(input[(int)(order.charAt(0)) - 65] + " ");
	System.out.print(input[(int)(order.charAt(1)) - 65] + " ");
	System.out.print(input[(int)(order.charAt(2)) - 65] + " ");

    }

}
