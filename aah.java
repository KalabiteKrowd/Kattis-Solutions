import java.util.Scanner;

public class aah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        if (tmp.length() >= sc.nextLine().length())
            System.out.println("Go");
        else
            System.out.println("No");
    }
}
