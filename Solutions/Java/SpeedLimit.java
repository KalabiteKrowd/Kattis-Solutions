import java.util.*;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int setSize = input.nextInt();
        while (setSize != -1) {
            int sum = 0;
            int previousMiles = 0;
            for (int i = 0; i < setSize; i++) {
                int speed = input.nextInt();
                int currentMiles = input.nextInt();
                sum += speed * (currentMiles - previousMiles);
                previousMiles = currentMiles; 
            }//for i
            System.out.println(sum + " miles");
            setSize = input.nextInt();
        }//while
    }//main

}//class
