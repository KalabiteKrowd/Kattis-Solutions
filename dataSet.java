import java.util.Scanner;

public class dataSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dataSets = sc.nextInt();
	int tmp = 0;
	int score;
	double avg;
	for (int i = 0; i < dataSets; i++) {
		score = 0;
		tmp = sc.nextInt();
		for (int j = 0; j < tmp; j++) {
			score += sc.nextInt();
		}
		avg = score / tmp;
		System.out.printf("%.3f", avg);
		System.out.println("%");
	}//for

    }

}
