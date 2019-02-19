import java.util.*;

public class Trik {
    public static void main(String[] args) {
        //always start on leftmost side
        boolean position[] = {true, false, false};

        //read inputs
        Scanner input = new Scanner(System.in);
        String changes = input.next();
        
        //process each character and swap accordingly
        for (int i = 0; i < changes.length(); i++) {
            switch (changes.charAt(i)) {
                case 'A':   swap(0, 1, position);
                    break;
                case 'B':   swap(1, 2, position);
                    break;
                case 'C':   swap(0, 2, position);
                    break;
                default:    System.out.println("Invalid input");
                    break;
            }//switch 
        }//for i

        //Print ball position
        for (int i = 0; i < position.length; i++) {
            if (position[i])
                System.out.println((i + 1));
        }//for i
    }//main

    //swaps the position of the ball between the two cups
    public static void swap(int cup1, int cup2, boolean[] position) {
        boolean tmp = position[cup1];
        position[cup1] = position[cup2];
        position[cup2] = tmp;
    }//swap

}//class
