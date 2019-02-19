import java.util.*;

public class Cetvrta {
    public static void main(String[] args) {
        //data setup
        int[] column1 = new int[3];
        int[] column2 = new int[3];
        
        //new point
        int x = 0, y = 0;

        //read inputs
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < column1.length;i++) {
            column1[i] = input.nextInt();
            column2[i] = input.nextInt();
        }//for i

        //computes new point
        for (int i = 0; i < column1.length; i++) {
            if (count(column1[i], column1) == 1) {
                x = column1[i];
            }//if
            if (count(column2[i], column2) == 1) {
                y = column2[i];
            }//if
        }//for

        System.out.println(x + " " + y);
    }//main

    public static int count(int value, int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (value == list[i])
                count++;
        }//for i
        return count;
    }//count
}//class
