import java.util.*;   
import java.math.*;

public class Wizard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger N = input.nextBigInteger();
        	BigInteger K = input.nextBigInteger();
        	N = BigInteger.valueOf(N.bitLength() - 1);
        	System.out.println("N: " + N);
        	System.out.println("K: " + K);
        	if (K.compareTo(N) >= 0)
        	   	System.out.println("Your wish is granted!");
        	else
			System.out.println("You will become a flying monkey!");
	}

}

