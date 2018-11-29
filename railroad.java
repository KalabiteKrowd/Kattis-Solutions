import java.util.Scanner;

public class railroad {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);//creates scanner
		//first number is useless
		kb.nextInt();
		//Second number must be event
		int Y = kb.nextInt();
		if (Y % 2 == 0)
			System.out.println("possible");
		else
			System.out.println("impossible");
	
	}

}
