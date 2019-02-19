import java.util.*;

public class Tarifa {
    public static void main(String[] args) {
        //reads inputs
        Scanner input = new Scanner(System.in);
        int MBPerMonth = input.nextInt();
        int months = input.nextInt();
        int totalMB = 0;

        //calculates cumulative total
        for (int i = 0; i < months; i++) {
            totalMB += MBPerMonth;
            totalMB -= input.nextInt();
        }//for i

        //Dont forget his allotment for the N + 1 month
        totalMB += MBPerMonth;

        //the solution
        System.out.println(totalMB);
    }//main
}//class
