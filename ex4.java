package semester1.assaigment2;
// assignment: 2
// Author: Michael Kupfer , ID: 209493246
//create array from 10 numbers from user and swap numbers if they
// divers in between and print new array
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers (0 is not allowed): ");
        //put in numbers from user
        for (int i =0;i< arr.length;i++) arr[i] = input.nextInt();
        for (int j=0;j<5;j++){
            //if they diverse in between so they swap.
            if(arr[2*j]%arr[(2*j)+1]==0){
                int temp=arr[2*j];
                arr[2*j]=arr[(2*j)+1];
                arr[(2*j)+1]=temp;
            }
        }
        //print the array
        System.out.print("Result array ");
        for (int k =0; k< arr.length;k++)
            System.out.print(arr[k]+" ");
    }
}
