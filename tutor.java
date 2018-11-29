public class tutor {
	public static void main(String[] args) {
		//tells us if we have used the number
		boolean[] used = new boolean[50];
		//stores the unique numbers
		int[] arr = new int[16];

		//for each index
		for (int i = 0; i < 16; i++) {
			//guess a random number
			int tmp = (int) (Math.random() * 50) + 1;

			//that number has already been used
			while (used[tmp - 1]) {
				//so we try to generate another
				tmp = (int) (Math.random() * 50) + 1;
			}//while
			
			//we have used the number
			used[tmp - 1] = true;
			//store the number
			arr[i] = tmp;
		}//for i

		//prints the values
		for (int i = 0; i < 16; i++) {
			System.out.print(arr[i] + " ");
		}//for i
	}
}
