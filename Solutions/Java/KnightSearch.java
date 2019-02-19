import java.util.*;

public class KnightSearch {

    public static char board[][];
    public static final String goal = "ICPCASIASG";
    public static boolean found;

    public static void main(String[] args) {
        char key = goal.charAt(0);
        found = false;
        initBoard();
        //displayBoard();
        for (int i = 0; !found && i < board.length; i++) {
            for (int j = 0; !found && j < board[i].length; j++) {
                if (board[i][j] == key) {
                    search(1, i, j);
                }//if
            }//for j
        }//for i
        if (found)
            System.out.println("YES");
        else
            System.out.println("NO");
    }//main

    public static void search(int index, int a, int b) {
        if (index == goal.length()) 
            found = true;
        else {
            //what are we looking for
            char key = goal.charAt(index);
            //System.out.println("index: " + index);
            //System.out.println("(a, b) " + "(" + a + " ," + b + ")");
            for (int i = 0; i < board.length && !found; i++) {
                for (int j = 0; j < board[i].length && !found; j++) {
                    //if the next char is found and is within range
                    if (board[i][j] == key && canMove(a, b, i, j)) {
                        search((index + 1), i, j);
                    }//if
                }//for j
            }//for i
        }//else
    }//search

    public static void initBoard() {
        Scanner input = new Scanner(System.in);
        int boardSize = input.nextInt();
        String line = input.next();
        board = new char[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = line.charAt(j);
            }//for i
            line = line.substring(boardSize);
        }//for j
    }//initBoard

    public static void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }//for j
            System.out.println("");
        }//for i
    }//displayBoard

    public static int biggest(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }//biggest

    public static int smallest(int x, int y) {
        if (x < y)
            return x;
        else
            return y;
    }//smallest

    public static int square(int x) {
        return x * x;
    }//square

    public static boolean canMove(int a, int b, int c, int d) {
        return square(a - c) + square(b - d) == 5;
    }//canMove
}//class
