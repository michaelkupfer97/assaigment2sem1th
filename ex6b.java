package semester1.assaigment2;

// assignment: 2
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex6b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[4][4];
        System.out.println("Enter 16 integers:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextInt();
                }
            }
        for (int h = 0; h < arr.length; h++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(arr[h][b]+" ");
            }
            System.out.println(" ");
        }
        for(int k=0;k< arr.length;k++)
            for (int w=0;w==0||w== arr.length-1;w++)
                for(int r =2; r<=Math.sqrt(arr[k][w]);r++){
                    if(arr[k][w]%r==0) {
                        System.out.println("false");
                        return;
                    }
                }
        System.out.println("true");
    }
}