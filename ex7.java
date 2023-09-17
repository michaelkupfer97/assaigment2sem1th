package semester1.assaigment2;
// assignment: 2
// Author: Michael Kupfer , ID: 209493246

//tic tac toe game. no functions.
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //making the array of char.
        char arr[][] = new char[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = '_';
            }
        }
        //print the table for the first time and gives instructions to players.
        System.out.println("The table result: ");
        for (int h = 0; h < arr.length; h++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(" | "+arr[h][b]);
            }
            System.out.println(" | ");
            System.out.println("______________");
        }
        //loop that goes on until there is a winner or draw.
        do {
            System.out.println("Enter row and column for player x: ");
            int row = input.nextInt();
            int column = input.nextInt();
            //first time of x play.
            //check for good combination.
            while(arr[row][column]=='x' || arr[row][column]=='o') {
                System.out.println("please try again");
                row = input.nextInt();
                column = input.nextInt();
            }
            arr[row][column]='x';
            //print the result of board after x play
            System.out.println("The table result: ");
            for (int h = 0; h < arr.length; h++) {
                for (int b = 0; b < arr[0].length; b++) {
                    System.out.print(" | " + arr[h][b]);
                }
                System.out.println(" | ");
                System.out.println("______________");
            }
            //check if player x win
            if((arr[0][0]=='x'&& arr[1][0]=='x'&& arr[2][0]=='x')||
                    (arr[0][1]=='x'&& arr[1][1]=='x'&& arr[2][1]=='x') ||
                    (arr[0][2]=='x'&& arr[1][2]=='x'&& arr[2][2]=='x') ||
                    (arr[0][0]=='x'&& arr[0][1]=='x'&& arr[0][2]=='x') ||
                    (arr[1][0]=='x'&& arr[1][1]=='x'&& arr[1][2]=='x') ||
                    (arr[2][0]=='x'&& arr[2][1]=='x'&& arr[2][2]=='x') ||
                    (arr[2][0]=='x'&& arr[1][1]=='x'&& arr[0][2]=='x') ||
                    (arr[0][0]=='x'&& arr[1][1]=='x'&& arr[2][2]=='x')){
                System.out.println("The winner is x!!!!!");
                return;
            }
            //check if it is a draw
            if((arr[0][0]!='_')&&(arr[1][0]!='_')&&(arr[2][0]!='_')&&
                    (arr[1][1]!='_')&&(arr[0][1]!='_')&&(arr[0][2]!='_')&&
                    (arr[2][2]!='_')&&(arr[1][2]!='_')&&(arr[2][1]!='_')){
                System.out.println("Its a draw!");
                return;
            }

            System.out.println("Enter row and column for player o: ");
            row = input.nextInt();
            column = input.nextInt();
            //first time of o play.
            //check for good combination.
            while (arr[row][column]=='x' || arr[row][column]=='o') {
                System.out.println("please try again");
                row = input.nextInt();
                column = input.nextInt();
            }
            arr[row][column]='o';
            //print the result of board after o play
            System.out.println("The table result: ");
            for (int h = 0; h < arr.length; h++) {
                for (int b = 0; b < arr[0].length; b++) {
                    System.out.print(" | " + arr[h][b]);
                }
                System.out.println(" | ");
                System.out.println("______________");
            }
            //check if player o win
            if((arr[0][0]=='o'&& arr[1][0]=='o'&& arr[2][0]=='o')||
                    (arr[0][1]=='o'&& arr[1][1]=='o'&& arr[2][1]=='o') ||
                    (arr[0][2]=='o'&& arr[1][2]=='o'&& arr[2][2]=='o') ||
                    (arr[0][0]=='o'&& arr[0][1]=='o'&& arr[0][2]=='o') ||
                    (arr[1][0]=='o'&& arr[1][1]=='o'&& arr[1][2]=='o') ||
                    (arr[2][0]=='o'&& arr[2][1]=='o'&& arr[2][2]=='o') ||
                    (arr[2][0]=='o'&& arr[1][1]=='o'&& arr[0][2]=='o') ||
                    (arr[0][0]=='o'&& arr[1][1]=='o'&& arr[2][2]=='o')){
                System.out.println("The winner is o!!!!!");
                return;
            }
            //check if it is a draw
            if((arr[0][0]!='_')&&(arr[1][0]!='_')&&(arr[2][0]!='_')&&
                    (arr[1][1]!='_')&&(arr[0][1]!='_')&&(arr[0][2]!='_')&&
                    (arr[2][2]!='_')&&(arr[1][2]!='_')&&(arr[2][1]!='_')){
                System.out.println("Its a draw!");
                return;
            }

        }while (true);
    }
}
