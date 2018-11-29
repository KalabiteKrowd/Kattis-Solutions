import java.lang.Math;

public class Chicken {

	public static void main(String[] args) {
		while (true) {
			for (int i = 0; i < (Math.random() * 255); i++){
				System.out.print(" ");
			}
			System.out.print("Chicken");
			for (int i = 0; i < (Math.random() * 255); i++) {
				System.out.print(" ");
			}
			System.out.println("Chicken");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			
		}
	}

}
