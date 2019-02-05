import java.util.*;

public class Different {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long rhs, lhs;
        while (in.hasNext()) {
            lhs = in.nextLong();
            rhs = in.nextLong();
            long difference = lhs - rhs;
            if (difference < 0) 
                System.out.println( (difference * -1));
            else
                System.out.println(difference);
        }
    }
}
