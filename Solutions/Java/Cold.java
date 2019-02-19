import java.util.*;

public class Cold {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int readings = input.nextInt();
        int count = 0;
        for (int i = 0; i < readings; i++) {
            if (input.nextInt() < 0)
                count++;
        }//for
        System.out.println(count);
    }//main 
}//class   
