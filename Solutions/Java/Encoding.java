import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char type = input.next().charAt(0);
		char tmp;
		int tmpCount = 0;
		String msg = input.next();
		if (type == 'E') {
			for (int i = 0; i < msg.length(); i++) {
				tmp = msg.charAt(i);
				tmpCount = 0;
				for (int j = i; j < msg.length(); j++) {
					if (tmp != msg.charAt(j))
						break;
					else {
						tmpCount++;
					}
				}
				i += tmpCount - 1;
				System.out.print(tmp + Integer.toString(tmpCount));
			}
		}
		else {
			for (int i = 0; i < msg.length(); i += 2) {
				tmp = msg.charAt(i);
				tmpCount = (int)msg.charAt(i + 1) - '0';
				for (int j = 0; j < tmpCount; j++) {
					System.out.print(tmp);
				}
			}	
		}
	}
}
