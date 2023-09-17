package semester1.assaigment2;

// assignment: 2
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[9][9];
        System.out.println("Enter sudoku table- row by row");
        //gets from user the sudoku table row by row.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println("Next row please:");
        }
        //print the sudoku table
        for (int h = 0; h < arr.length; h++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(" | " + arr[h][b]);
            }
            System.out.println(" | ");
            System.out.println("_________________________________");
        }
        //check for every row in the table.
        //if false - print notice and end program
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length - 1; col++)
                for (int colsec = col+1; colsec < arr.length; colsec++)
                    if (arr[row][col] == arr[row][colsec]) {
                        System.out.println("The sudoku table is WRONG.");
                        return;
                    }
        }
        //check every column of the table.
        //if false - print notice and end program
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[0].length - 1; row++)
                for (int rowsec = row+1; rowsec < arr.length; rowsec++)
                    if (arr[row][col] == arr[rowsec][col]) {
                        System.out.println("The sudoku table is WRONG.");
                        return;
                    }
        }
        //check every squer on the table
        //if false - print notice and end program
        for (int row = 0 ; row < 9 ; row+=3 )
            for (int col = 0 ; col < 3 ; col+=3 )
                for (int squer=0;squer<8;squer++)
                    for (int squer2=squer+1;squer2<9;squer2++)
                        if(arr[row+squer%3][col+squer/3]==arr[row+squer2%3][col+squer2/3]){
                            System.out.println("The sudoku table is WRONG.");
                            return;
                        }
        System.out.println("The sudoku table is OK");
    }
}

