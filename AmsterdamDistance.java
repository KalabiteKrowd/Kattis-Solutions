import java.util.*;
import java.lang.*;

public class AmsterdamDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int slices = input.nextInt();
		int rings = input.nextInt();
		double radius = input.nextDouble();
		int intX = input.nextInt();
		int intY = input.nextInt();
		int finalX = input.nextInt();
		int finalY = input.nextInt();


//these formulas don't work		
		double yDistance = (double)(intY - finalY) * radius / rings;
		yDistance = Math.abs(yDistance);
		System.out.println("Y distance: " + yDistance);

		double xDistance = (double)(intX - finalX) / slices * 3.14159264358979323 * finalY / rings * radius;	
		xDistance = Math.abs(xDistance);
		System.out.println("X distance: " + xDistance);

		System.out.println( (xDistance + yDistance) );
	}
}
